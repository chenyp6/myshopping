package com.cyp.gp.men.service.impl;

import com.cyp.gp.men.dto.MenshoesDTO;
import com.cyp.gp.men.mapper.MenshoesMapper;
import com.cyp.gp.men.service.interfaces.MenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/4/13.
 */
@Service
public class MenServiceImpl implements MenService{
    @Autowired
    MenshoesMapper menshoesMapper;

    public List<MenshoesDTO> GetMenShoesByPage(int page){
        List<MenshoesDTO> menshoesDTOs=menshoesMapper.selectByPage(page);
        return menshoesDTOs;
    }

    public int GetMenShoesCounts(){
        return menshoesMapper.GetMenShoesCounts();
    }
}
