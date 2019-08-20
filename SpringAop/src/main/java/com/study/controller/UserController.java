package com.study.controller;

import com.study.entity.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "sayHello",method = RequestMethod.GET)
    public String sayHello(String name){
        return "hello - "+name;
    }
    @RequestMapping(value = "sayHi",method = RequestMethod.GET)
    public String sayHehe(String name){
        return "hehe"+name;
    }

}

