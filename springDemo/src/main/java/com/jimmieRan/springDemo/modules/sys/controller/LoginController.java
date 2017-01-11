package com.jimmieRan.springDemo.modules.sys.controller;

import com.jimmieRan.springDemo.modules.sys.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

/**
 * Created by ran on 2017/1/9.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model){

        //如果已经登录，则跳转到主页
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        if (principal != null){
            return "index";
        }

        //登录验证失败，则跳转到登录页面并显示失败信息
        String loginFailure = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
        if ( loginFailure != null ){

        }


        return "login";
    }

}
