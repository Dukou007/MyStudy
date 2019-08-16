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
public class AoptestApplicationTests {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
        User user = new User(12, "hello", 19);
//        UserService userService= new UserServiceImpl();
//        UserService userService = UserServiceFactory.createUserService();
        UserService userservice = UserFactory2.createUserservice();
        userService.addUser(user);
       /* userService.deleteUser(
                1);
        userService.updateUser(user);
        userService.findByNameLike("hello");*/
        System.out.println("game over");
    }

}
