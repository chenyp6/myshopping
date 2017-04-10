package com.cyp.gp.single.service.impl;

import com.cyp.gp.cart.dao.Cart;
import com.cyp.gp.cart.mapper.CartMapper;
import com.cyp.gp.hall.dao.Shoes;
import com.cyp.gp.hall.mapper.ShoesMapper;
import com.cyp.gp.single.vo.CartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cyp.gp.single.service.interfaces.SingleService;
/**
 * Created by admin on 2017/4/10.
 */
@Service
public class SingleServiceImpl implements SingleService {
    @Autowired
    ShoesMapper shoesMapper;
    @Autowired
    CartMapper cartMapper;

    public Shoes GetShoes(String shoesid){
        Shoes shoes=shoesMapper.selectByPrimaryKey(shoesid);
        return shoes;
    }

    public int AddToCart(Cart cart){
       int i= cartMapper.insert(cart);
        return i;
    }
}
