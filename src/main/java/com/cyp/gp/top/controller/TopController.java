package com.cyp.gp.top.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2017/4/22.
 */
@Controller
public class TopController {

    @RequestMapping("/top")
    public String top(){
        return "top/top";
    }
}
