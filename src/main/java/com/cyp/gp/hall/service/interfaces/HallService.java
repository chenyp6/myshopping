package com.cyp.gp.hall.service.interfaces;

import com.cyp.gp.hall.dao.Image;

import java.util.List;

/**
 * Created by admin on 2017/4/9.
 */
public interface HallService {
    public Image Getshowimage(String imageid)throws Exception;
    public List<String> GetIndexshoesids()throws Exception;
}
