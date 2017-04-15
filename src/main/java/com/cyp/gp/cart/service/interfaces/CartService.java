package com.cyp.gp.cart.service.interfaces;

import com.cyp.gp.cart.dto.CartDTO;

import java.util.List;

/**
 * Created by admin on 2017/4/15.
 */
public interface CartService {
    List<CartDTO> GetCart(String userid);

}
