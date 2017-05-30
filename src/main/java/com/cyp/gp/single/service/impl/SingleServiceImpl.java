package com.cyp.gp.single.service.impl;

import com.cyp.gp.cart.dao.Cart;
import com.cyp.gp.cart.dao.CartKey;
import com.cyp.gp.cart.mapper.CartMapper;
import com.cyp.gp.hall.dao.Shoes;
import com.cyp.gp.hall.mapper.ShoesMapper;
import com.cyp.gp.single.dao.Evaluation;
import com.cyp.gp.single.dao.EvaluationExample;
import com.cyp.gp.single.dto.EvaluationDTO;
import com.cyp.gp.single.mapper.EvaluationMapper;
import com.cyp.gp.single.vo.CartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cyp.gp.single.service.interfaces.SingleService;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 2017/4/10.
 */
@Service
public class SingleServiceImpl implements SingleService {
    @Autowired
    ShoesMapper shoesMapper;
    @Autowired
    CartMapper cartMapper;
    @Autowired
    EvaluationMapper evaluationMapper;

    public Shoes GetShoes(String shoesid){
        Shoes shoes=shoesMapper.selectByPrimaryKey(shoesid);
        return shoes;
    }

    public int AddToCart(Cart cart){
        int i=0;
        CartKey cartKey=new CartKey();
        cartKey.setUserid(cart.getUserid());
        cartKey.setShoesid(cart.getShoesid());
        if (cartMapper.selectByPrimaryKey(cartKey)==null){
            cartMapper.insert(cart);
            i=1;
        }
        else{
            cart.setNumber(cartMapper.selectByPrimaryKey(cartKey).getNumber()+cart.getNumber());
            cartMapper.updateByPrimaryKey(cart);
            i=1;
        }
        return i;
    }

    public List<EvaluationDTO> GetEvaluation(String shoesid){
        EvaluationExample evaluationExample = new EvaluationExample();
        EvaluationExample.Criteria criteria = evaluationExample.createCriteria();
        criteria.andShoesidEqualTo(shoesid);
        List<Evaluation> evaluations = evaluationMapper.selectByExample(evaluationExample);
        List<EvaluationDTO> evaluationDTOs = new LinkedList<EvaluationDTO>();
        for (Evaluation t : evaluations){
            EvaluationDTO evaluationDTO = new EvaluationDTO();
            evaluationDTO.setShoesid(t.getShoesid());
            evaluationDTO.setUserid(t.getUserid());
            evaluationDTO.setEvaluation(t.getEvaluation());
            evaluationDTOs.add(evaluationDTO);
        }
        return evaluationDTOs;
    }
}
