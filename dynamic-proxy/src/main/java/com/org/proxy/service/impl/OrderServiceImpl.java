package com.org.proxy.service.impl;

import com.org.proxy.service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void generate() {
        System.out.println("生成订单");
    }

    @Override
    public void modify() {
        System.out.println("订单已修改");
    }

    @Override
    public void detail() {
        System.out.println("查看订单");
    }
}
