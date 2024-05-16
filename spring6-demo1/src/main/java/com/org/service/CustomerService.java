package com.org.service;

import com.org.dao.UserDao;
import com.org.dao.VipDao;

public class CustomerService {

    private UserDao userDao;

    private VipDao vipDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public VipDao getVipDao() {
        return vipDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    // 构造函数注入
  /*  public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }
*/
    public void save() {
        vipDao.insert();
        userDao.insert();
    }
}
