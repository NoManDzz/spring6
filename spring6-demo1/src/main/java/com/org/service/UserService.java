package com.org.service;

import com.org.dao.UserDao;

public class UserService {
    private UserDao userDao;

    //spring set 注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser() {
        userDao.insert();
    }
}
