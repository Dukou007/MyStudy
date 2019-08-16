package com.study;

import com.study.dao.UserDao;
import com.study.entity.User;
import com.study.factory.UserFactory2;
import com.study.factory.UserServiceFactory;
import com.study.service.UserService;
import com.study.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAopApplicationTests {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
        System.out.println("hello");
    }

}
