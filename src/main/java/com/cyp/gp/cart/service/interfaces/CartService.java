package com.cyp.gp.cart.service.interfaces;

import com.cyp.gp.cart.dao.CartKey;
import com.cyp.gp.cart.dto.CartDTO;

import java.util.List;
import com.cyp.gp.cart.dto.saledshoesDTO;

/**
 * Created by admin on 2017/4/15.
 */
public interface CartService {
    List<CartDTO> GetCart(String userid);
    int DeleteShoes(CartKey cartKey);
    void InsertIntoSaledTable(List<saledshoesDTO> saledshoesDTOs,String userid);
}
