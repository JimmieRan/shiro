package com.jimmieRan.springDemo.modules.sys.controller;

import com.jimmieRan.springDemo.modules.sys.entity.Resource;
import com.jimmieRan.springDemo.modules.sys.entity.User;
import com.jimmieRan.springDemo.modules.sys.service.ResourceService;
import com.jimmieRan.springDemo.modules.sys.service.UserServiceI;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Set;

/**
 * ${DESCRIPTION}
 * <p> User: ran
 * <p> Date: 2017/1/20
 * <p> Version: 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private UserServiceI userService;

    @RequestMapping(value = "index")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();

        Set<String> permissions = userService.findPermissions(principal.toString());
        List<Resource> menus = resourceService.findMenus(permissions);
        model.addAttribute("menus", menus);
        return "index";
    }

    /**
     * 欢迎界面
     * @return
     */
    @RequestMapping(value = "welcome")
    public String welcome(){
        return "welcome";
    }

}
