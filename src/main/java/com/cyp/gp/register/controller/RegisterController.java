package com.cyp.gp.register.controller;

import com.cyp.gp.register.dto.UsersDTO;
import com.cyp.gp.register.service.interfaces.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cyp.gp.register.dao.Users;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by admin on 2017/4/7.
 */
@Controller
public class RegisterController {
    @Autowired
    RegisterService registerService;
    @RequestMapping("/register")
    public String register(){
        return "register/register";
    }

    @RequestMapping("/changeCaptcha")
    public String changeCaptcha(){
        return "register/register";
    }


    @RequestMapping("/checkuserid")
    @ResponseBody
    public  ModelMap checkuserid(String userid)throws Exception{
        UsersDTO usersDTO=new UsersDTO();
        usersDTO.setUserid(userid);
        ModelMap model=new ModelMap();
        if(registerService.CheckUser(usersDTO.getUserid())==0){
            model.addAttribute("mes", "1");
            return model;
        }
        else{
            model.addAttribute("mes", "2");
            return model;
        }
    }

    @RequestMapping("/checkrand")
    @ResponseBody
    public  ModelMap checkrand(String rand,HttpSession session)throws Exception{
        ModelMap model=new ModelMap();
        String rand1 = (String) session.getAttribute("rand");
        if(rand.equalsIgnoreCase(rand1)){
            model.addAttribute("mes", "1");
            return model;
        }
        else{
            model.addAttribute("mes", "2");
            return model;
        }
    }

    @RequestMapping("/registeruser")
    public String registeruser(UsersDTO usersDTO)throws Exception {
                    Users users = new Users();
                    users.setUserid(usersDTO.getUserid());
                    users.setPwd(usersDTO.getPwd());
                    users.setEmail(usersDTO.getEmail());
                    users.setPhone(usersDTO.getPhone());
                    users.setGrid(1);
                    registerService.AddUser(users);
                    return "register/RegisterSucess";
    }

}
