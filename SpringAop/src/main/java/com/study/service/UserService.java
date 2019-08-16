package com.study.service;

import com.study.entity.User;

public interface UserService {
    void addUser(User user);
    void deleteUser(Integer id);
    User findByNameLike(String name);
    void updateUser(User user);
}
