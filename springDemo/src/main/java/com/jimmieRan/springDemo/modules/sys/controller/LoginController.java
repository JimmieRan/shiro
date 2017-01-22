package com.jimmieRan.springDemo.modules.sys.controller;

import com.jimmieRan.springDemo.common.StringUtils;
import com.jimmieRan.springDemo.modules.sys.Filter.FormAuthenticationFilter;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class LoginController {

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {

        //如果已经登录，则初始化并跳转
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();

        if (principal != null){
            return "redirect://index";
        }

        return "login";
    }

    /**
     * 登录操作，实际操作由filter完成
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {

        //如果已经登录，则初始化并跳转
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();

        if (principal != null){
            return "redirect://index";
        }

        //登录验证失败，则跳转到登录页面并显示失败信息
        String message = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_MESSAGE_PARAM);

        if (StringUtils.isNotBlank(message)) {
            model.addAttribute(FormAuthenticationFilter.DEFAULT_MESSAGE_PARAM, message);
        }
        return "login";
    }


}
