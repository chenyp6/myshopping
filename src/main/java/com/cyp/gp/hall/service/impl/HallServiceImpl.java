package com.cyp.gp.hall.service.impl;

import com.cyp.gp.hall.dao.Image;
import com.cyp.gp.hall.mapper.ImageMapper;
import com.cyp.gp.hall.mapper.IndexshoesMapper;
import com.cyp.gp.hall.service.interfaces.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<String>GetIndexshoesids()throws Exception{
        List<String> shoesids=indexshoesMapper.getShoesid();
        return shoesids;
    }

}
