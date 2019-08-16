package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.entity.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:impl
 * @author:zhou_xiaolong
 * @date:2019/7/23 15:54
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        System.out.println("增加 用户……");
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("删除用户……");
    }


    @Override
    public User findByNameLike(String name) {
        System.out.println("查找用户……");
        return null;
    }

    @Override
    public void updateUser(User user) {
        System.out.println("更新用户……");

    }
}
