package com.cyp.gp.cart.controller;

import com.cyp.gp.cart.dao.CartKey;
import com.cyp.gp.cart.dto.CartDTO;
import com.cyp.gp.cart.service.interfaces.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import com.cyp.gp.cart.dto.saledshoesDTO;

/**
 * Created by admin on 2017/4/15.
 */
@Controller
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping("/cart")
    public String cart(){
        return "cart/cart";
    }

    @RequestMapping("/querycart")
    @ResponseBody
    public ModelMap querycart(HttpServletRequest request){
        ModelMap model=new ModelMap();
        String userid=(String)request.getSession().getAttribute("userid");
        List<CartDTO> cartDTOs=cartService.GetCart(userid);
        model.addAttribute("cartDTOs",cartDTOs);
        return model;
    }

    @RequestMapping("/deleteshoes")
    @ResponseBody
    public ModelMap deleteshoes(String shoesid,HttpServletRequest request){
        ModelMap model=new ModelMap();
        String userid=(String) request.getSession().getAttribute("userid");
        CartKey cartKey= new CartKey();
        cartKey.setShoesid(shoesid);
        cartKey.setUserid(userid);
        if(cartService.DeleteShoes(cartKey)==1){
            model.addAttribute("msg","1");
        }else{
            model.addAttribute("msg","0");
        }
        return model;
    }

    @RequestMapping("/pay")
    @ResponseBody
    public ModelMap pay(@RequestBody List<saledshoesDTO> saledshoesDTOs,HttpServletRequest request){
        ModelMap model= new ModelMap();
        String userid=(String)request.getSession().getAttribute("userid");
        cartService.InsertIntoSaledTable(saledshoesDTOs,userid);
        return model;
    }

}
