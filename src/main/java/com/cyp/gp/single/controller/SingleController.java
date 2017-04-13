package com.cyp.gp.single.controller;

import com.cyp.gp.cart.dao.Cart;
import com.cyp.gp.hall.dao.Shoes;
import com.cyp.gp.single.service.interfaces.SingleService;
import com.cyp.gp.single.vo.CartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/4/10.
 */
@Controller
public class SingleController {
    @Autowired
    SingleService singleService;

    @RequestMapping("/querysingle")
    @ResponseBody
    public ModelMap querysingle(String shoesid)throws Exception{
        ModelMap model=new ModelMap();
        Shoes shoes=singleService.GetShoes(shoesid);
        model.addAttribute("shoesprice",shoes.getPrice());
        model.addAttribute("shoesname",shoes.getShoesname());
        model.addAttribute("introduction",shoes.getIntroduction());
        model.addAttribute("shoeslevel",shoes.getShoeslevel());
        return model;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public ModelMap addtocart(CartVO cartVO, HttpServletRequest request)throws Exception{
        ModelMap model=new ModelMap();

        Cart cart=new Cart();
        cart.setUserid((String)request.getSession().getAttribute("userid"));
        cart.setShoesid(cartVO.getShoesid());
        cart.setImagepath(cartVO.getImagepath());
        cart.setSize(cartVO.getSize());
        cart.setNumber(Integer.parseInt(cartVO.getNumber()));
        cart.setPrice(Integer.parseInt(cartVO.getPrice()));

       int mes=singleService.AddToCart(cart);
        model.addAttribute("mes",mes+"");
        return model;
    }

}
