package com.jimmieRan.springDemo.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ran on 2017/1/11.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "update")
    public String updateUser(){
        return "reg";
    }

}
