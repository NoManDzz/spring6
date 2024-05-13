package com.org.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {
    //日记记录
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDao.class);

    public void insert() {
        LOGGER.info("user数据库正在保持，。");
    }
}
