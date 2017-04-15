package com.cyp.gp.cart.service.impl;

import com.cyp.gp.cart.dao.Cart;
import com.cyp.gp.cart.dao.CartExample;
import com.cyp.gp.cart.dto.CartDTO;
import com.cyp.gp.cart.mapper.CartMapper;
import com.cyp.gp.cart.service.interfaces.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 2017/4/15.
 */
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;

    public List<CartDTO> GetCart(String userid){
        List<CartDTO> cartDTOs=new LinkedList<CartDTO>();
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<Cart> carts=cartMapper.selectByExample(cartExample);
        for(Cart t :carts){
            CartDTO cartDTO=new CartDTO();
            cartDTO.setUserid(t.getUserid());
            cartDTO.setShoesid(t.getShoesid());
            cartDTO.setPrice(t.getPrice());
            cartDTO.setNumber(t.getNumber());
            cartDTO.setImagepath(t.getImagepath());
            cartDTO.setSize(t.getSize());
            cartDTOs.add(cartDTO);
        }
        return cartDTOs;
    }
}
