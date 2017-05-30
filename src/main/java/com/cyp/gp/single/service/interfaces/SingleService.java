package com.cyp.gp.single.service.interfaces;

import com.cyp.gp.cart.dao.Cart;
import com.cyp.gp.hall.dao.Shoes;
import com.cyp.gp.single.dao.Evaluation;
import com.cyp.gp.single.dto.EvaluationDTO;

import java.util.List;

/**
 * Created by admin on 2017/4/10.
 */
public interface SingleService {
    Shoes GetShoes(String shoesid)throws Exception;
    int AddToCart(Cart cart)throws Exception;
    List<EvaluationDTO> GetEvaluation(String shoesid);
}
