package com.qfedu.ssm.controller;

import com.qfedu.ssm.pojo.User;
import com.qfedu.ssm.service.UserService;
import com.qfedu.ssm.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/regUser")
    @ResponseBody
    public String regUser(User user){

        boolean result = userService.regUser(user);

        if (result){
            return "success";
        }else{
            return "fail";
        }
    }

    @RequestMapping("/validateEmail")
    @ResponseBody
    public String validateEmail(User user){

        boolean result = userService.validateEmail(user);

       if (result){
           return "success";
       } else {
           return "fail";
       }
    }

    @RequestMapping("validateLogin")
    @ResponseBody
    public String validateLogin(User user){

        boolean result = userService.validateLogin(user);
        if (result){
            return "success";
        }else{
            return "fail";
        }
    }
}
