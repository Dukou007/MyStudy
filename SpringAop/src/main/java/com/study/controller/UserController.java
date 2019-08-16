package com.study.controller;

import com.study.annotation.LogAnnotation;
import com.study.entity.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "add")
    public void addUser(User user) {
        user.setName("xufengnian");
        userService.addUser(user);
    }

}

