package com.cyp.gp.cart.controller;

import com.cyp.gp.cart.dto.CartDTO;
import com.cyp.gp.cart.service.interfaces.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
}
