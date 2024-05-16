package com.org.proxy.service.impl;

import com.org.proxy.service.OrderService;

public class OrderServiceProxy implements OrderService {


    private OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    private void showTime() {
        long begin = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        orderService.generate();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    @Override
    public void modify() {
        showTime();
    }

    @Override
    public void detail() {
        showTime();
    }
}
