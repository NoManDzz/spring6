package com.org.service;

import com.org.pojo.User;

import java.util.List;

public interface UserService {
    int save(User user);

    int deleteById(Integer id);

    int modify(User user);

    User getById(Integer id);

    List<User> getAll();
}
