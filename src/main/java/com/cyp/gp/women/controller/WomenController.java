package com.cyp.gp.women.controller;

import com.cyp.gp.women.dao.Womenshoes;
import com.cyp.gp.women.dto.WomenshoesDTO;
import com.cyp.gp.women.service.interfaces.WomenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/4/12.
 */
@Controller
public class WomenController {
    @Autowired
    WomenService womenService;

    @RequestMapping("/womenshoes")
    public String women(){
        return"women/womenshoes";
    }

    @RequestMapping("/querywomenshoes")
    @ResponseBody
    public ModelMap querywomenshoes(String page){
        ModelMap model=new ModelMap();
        /*int i=0;*/
        List<WomenshoesDTO> womenshoesDTOs=womenService.GetWomenShoesByPage((Integer.parseInt(page)-1)*12+1);
       /* for (WomenshoesDTO t:womenshoes){
            model.addAttribute("womenshoes"+i,t);
            i++;
        }*/
        model.addAttribute("womenshoesDTOs",womenshoesDTOs);
        return model;
    }

}
