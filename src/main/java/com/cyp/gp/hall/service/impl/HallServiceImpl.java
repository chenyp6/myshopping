package com.cyp.gp.hall.service.impl;

import com.cyp.gp.hall.dao.Image;
import com.cyp.gp.hall.mapper.ImageMapper;
import com.cyp.gp.hall.mapper.IndexshoesMapper;
import com.cyp.gp.hall.service.interfaces.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cyp.gp.hall.dto.indexshoesDTO;

import java.util.List;

@Service
public class HallServiceImpl implements HallService {
    @Autowired
    ImageMapper imageMapper;
    @Autowired
    IndexshoesMapper indexshoesMapper;

    public Image Getshowimage(String imageid)throws Exception{
        Image image=imageMapper.selectByPrimaryKey(imageid);
        return image;
    }

    public List<indexshoesDTO>GetIndexshoesMES()throws Exception{
        List<indexshoesDTO> shoesMes=indexshoesMapper.getShoesMes();
        return shoesMes;
    }

}
