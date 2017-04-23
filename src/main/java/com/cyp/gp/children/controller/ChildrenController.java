package com.cyp.gp.children.controller;

import com.cyp.gp.children.dto.ChildrenShoesDTO;
import com.cyp.gp.children.service.interfaces.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/4/14.
 */
@Controller
public class ChildrenController {
    @Autowired
    ChildrenService childrenService;

    @RequestMapping("/childrenshoes")
    public String childrenshoes(){
        return "children/childrenshoes";
    }

    @RequestMapping("querychildrenshoes")
    @ResponseBody
    public ModelMap querychildrenshoes(String page){
        ModelMap model=new ModelMap();
        List<ChildrenShoesDTO> childrenShoesDTOs = childrenService.GetChildrenShoesByPage((Integer.parseInt(page)-1)*12);
        model.addAttribute("childrenshoesDTOs",childrenShoesDTOs);
        return model;
    }

}
