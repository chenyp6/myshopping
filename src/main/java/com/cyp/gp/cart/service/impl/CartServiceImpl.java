package com.cyp.gp.cart.service.impl;

import com.cyp.gp.cart.dao.Cart;
import com.cyp.gp.cart.dao.CartExample;
import com.cyp.gp.cart.dao.CartKey;
import com.cyp.gp.cart.dto.CartDTO;
import com.cyp.gp.cart.dto.saledshoesDTO;
import com.cyp.gp.cart.mapper.CartMapper;
import com.cyp.gp.cart.service.interfaces.CartService;
import com.cyp.gp.children.dao.Childrenshoes;
import com.cyp.gp.children.mapper.ChildrenshoesMapper;
import com.cyp.gp.hall.dao.Shoes;
import com.cyp.gp.hall.mapper.ShoesMapper;
import com.cyp.gp.men.dao.Menshoes;
import com.cyp.gp.men.mapper.MenshoesMapper;
import com.cyp.gp.women.dao.Womenshoes;
import com.cyp.gp.women.mapper.WomenshoesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 2017/4/15.
 */
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Autowired
    ShoesMapper shoesMapper;
    @Autowired
    MenshoesMapper menshoesMapper;
    @Autowired
    WomenshoesMapper womenshoesMapper;
    @Autowired
    ChildrenshoesMapper childrenshoesMapper;

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

    public int DeleteShoes(CartKey cartKey){
        int i=cartMapper.deleteByPrimaryKey(cartKey);
        return i;
    }

    public void InsertIntoSaledTable(List<saledshoesDTO> saledshoesDTOs,String userid){
        for(saledshoesDTO t:saledshoesDTOs){
            Shoes shoes = shoesMapper.selectByPrimaryKey(t.getShoesid());
            if(shoes.getIntroduction().startsWith("M")){
                Menshoes menshoes = new Menshoes();
                menshoes.setShoesid(shoes.getShoesid());
                menshoes.setPrice(shoes.getPrice());
                menshoes.setShoeslevel(shoes.getShoeslevel());
                menshoes.setIntroduction(shoes.getIntroduction());
                menshoes.setShoesname(shoes.getShoesname());
                menshoes.setSalenumber(t.getSalenumber()+menshoesMapper.selectByPrimaryKey(t.getShoesid()).getSalenumber());
                menshoesMapper.updateByPrimaryKey(menshoes);
            }else if(shoes.getIntroduction().startsWith("W")){
                Womenshoes womenshoes = new Womenshoes();
                womenshoes.setShoesid(shoes.getShoesid());
                womenshoes.setPrice(shoes.getPrice());
                womenshoes.setShoeslevel(shoes.getShoeslevel());
                womenshoes.setIntroduction(shoes.getIntroduction());
                womenshoes.setShoesname(shoes.getShoesname());
                womenshoes.setSalenumber(t.getSalenumber()+womenshoesMapper.selectByPrimaryKey(t.getShoesid()).getSalenumber());
                womenshoesMapper.updateByPrimaryKey(womenshoes);
            }else if(shoes.getIntroduction().startsWith("C")){
                Childrenshoes childrenshoes = new Childrenshoes();
                childrenshoes.setShoesid(shoes.getShoesid());
                childrenshoes.setPrice(shoes.getPrice());
                childrenshoes.setShoeslevel(shoes.getShoeslevel());
                childrenshoes.setIntroduction(shoes.getIntroduction());
                childrenshoes.setShoesname(shoes.getShoesname());
                childrenshoes.setSalenumber(t.getSalenumber()+childrenshoesMapper.selectByPrimaryKey(t.getShoesid()).getSalenumber());
                childrenshoesMapper.updateByPrimaryKey(childrenshoes);
            }
            CartKey cartKey =new CartKey();
            cartKey.setShoesid(t.getShoesid());
            cartKey.setUserid(userid);
            cartMapper.deleteByPrimaryKey(cartKey);
        }

    }

}
