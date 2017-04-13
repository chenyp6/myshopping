package com.cyp.gp.women.service.interfaces;

import com.cyp.gp.women.dao.Womenshoes;
import com.cyp.gp.women.dto.WomenshoesDTO;

import java.util.List;

/**
 * Created by admin on 2017/4/12.
 */
public interface WomenService {
    List<WomenshoesDTO> GetWomenShoesByPage(int page);
}
