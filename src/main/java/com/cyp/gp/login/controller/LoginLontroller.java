package com.cyp.gp.login.controller;

import com.cyp.gp.login.service.interfaces.LoginService;
import com.cyp.gp.login.dto.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.enterprise.inject.Model;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by admin on 2017/4/6.
 */
@Controller
public class LoginLontroller {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String login(){
        return"login/login";
    }

    @RequestMapping("/checkuser")
    public String checkuser(UsersDTO usersDTO,ModelMap model,HttpServletRequest request)throws Exception{
        if(loginService.CheckUser(usersDTO)==0){
           model.addAttribute("usersDTO",usersDTO);
            return "login/login";
        }
        else{
            request.getSession().setAttribute("userid",usersDTO.getUserid());
            model.addAttribute("userexits","1");
            model.addAttribute("userid",usersDTO.getUserid());
            return "hall/hall";
        }
    }
}
