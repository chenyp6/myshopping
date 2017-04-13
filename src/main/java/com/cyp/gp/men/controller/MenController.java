package com.cyp.gp.men.controller;

import com.cyp.gp.men.dto.MenshoesDTO;
import com.cyp.gp.men.service.interfaces.MenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/4/13.
 */
@Controller
public class MenController {
    @Autowired
    MenService menService;

    @RequestMapping("/menshoes")
    public String menshoes(){
        return "/men/menshoes";
    }

    @RequestMapping("querymenshoes")
    @ResponseBody
    public ModelMap querymenshoes(String page){
        ModelMap model=new ModelMap();
        List<MenshoesDTO> menshoesDTOs=menService.GetMenShoesByPage((Integer.parseInt(page)-1)*12+1);
        model.addAttribute("menshoesDTOs",menshoesDTOs);
        return model;

    }

}
