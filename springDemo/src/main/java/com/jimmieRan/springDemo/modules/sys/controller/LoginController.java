package com.jimmieRan.springDemo.modules.sys.controller;

import com.jimmieRan.springDemo.modules.sys.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**11
 * Created by ran on 2017/1/9.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "loginAction")
    public String login(User user){

        return "login";
    }

}
