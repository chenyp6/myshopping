package com.cyp.gp.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by admin on 2017/4/26.
 */
public class LoginInterceptor implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String url = httpServletRequest.getRequestURI();
        //判断url是否是公开 地址（实际使用时将公开 地址配置配置文件中）
        //这里公开地址是登陆提交的地址
        if(url.indexOf("cart")>=0){
            HttpSession session= httpServletRequest.getSession();
            String userid=(String)session.getAttribute("userid");
            if(userid == null){
                if (httpServletRequest.getHeader("x-requested-with")!= null && httpServletRequest.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
                    return true;
                }else {
                    httpServletResponse.sendRedirect("/myshopping/login");
                    return false;
                }
            }
        }


        return true;

    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
