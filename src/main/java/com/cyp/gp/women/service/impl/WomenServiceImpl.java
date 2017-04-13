package com.cyp.gp.women.service.impl;

import com.cyp.gp.women.dao.Womenshoes;
import com.cyp.gp.women.dto.WomenshoesDTO;
import com.cyp.gp.women.mapper.WomenshoesMapper;
import com.cyp.gp.women.service.interfaces.WomenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/4/12.
 */
@Service
public class WomenServiceImpl implements WomenService {
    @Autowired
    WomenshoesMapper womenshoesMapper;

    public List<WomenshoesDTO> GetWomenShoesByPage(int page){
        List<WomenshoesDTO> womenshoesDTO=womenshoesMapper.selectByPage(page);
        return womenshoesDTO;
    }
}
