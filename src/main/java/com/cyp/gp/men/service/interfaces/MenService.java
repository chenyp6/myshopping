package com.cyp.gp.men.service.interfaces;

import com.cyp.gp.men.dto.MenshoesDTO;

import java.util.List;

/**
 * Created by admin on 2017/4/13.
 */
public interface MenService {
    List<MenshoesDTO> GetMenShoesByPage(int page);
    int GetMenShoesCounts();
}
