package com.org.service;

import com.org.dao.OrderDao;

public class OrderService {
    private OrderDao orderDao;

    // set 注入
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate() {
        orderDao.insert();
    }
}
