package com.cyp.gp.hall.controller;

import com.cyp.gp.hall.dao.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cyp.gp.hall.service.interfaces.HallService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by admin on 2017/4/9.
 */
@Controller
public class HallController {
    @Autowired
    HallService hallService;

    @RequestMapping("/single")
    public ModelAndView single(ModelAndView modelAndView,String shoesid)throws Exception{

        Image image=hallService.Getshowimage(shoesid);
        modelAndView.addObject("shoesid",shoesid);
        modelAndView.addObject("mshow",image.getImageshow());
        modelAndView.addObject("mshow1",image.getImageshow1());
        modelAndView.addObject("mshow2",image.getImageshow2());
        modelAndView.addObject("mshow3",image.getImageshow3());
        modelAndView.setViewName("single/single");
        return modelAndView;
    }

    @RequestMapping("/queryindex")
    @ResponseBody
    public ModelMap querysingle()throws Exception{
        ModelMap model=new ModelMap();
        List<String> list=hallService.GetIndexshoesids();
        int i=1;
        for(String t :list){
            model.addAttribute("indexshoes"+i,t);
            i++;
        }
        return model;
    }
}
