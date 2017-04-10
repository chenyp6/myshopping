package com.cyp.gp.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/4/6.
 */
@Controller
public class logincontrol {
    @RequestMapping("/login")
    public String login(){
        return "login/login";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public ModelMap test1()throws Exception{
        ModelMap model=new ModelMap();
        model.addAttribute("mes","/images/f-r.jpg");
        return model;
    }
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
