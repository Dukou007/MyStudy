package com.study;

import com.study.annotation.LogAnnotation;
import com.study.entity.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:controller
 * @author:zhou_xiaolong
 * @date:2019/7/23 19:08
 */
@Controller
@RequestMapping(value="user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "add")
//    @LogAnnotation()
    public void addUser(User user) {
        user.setAge(18);
        user.setName("xufengnian");
        userService.addUser(user);
    }

}
