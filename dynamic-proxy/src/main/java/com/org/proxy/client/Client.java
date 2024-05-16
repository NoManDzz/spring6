package com.org.proxy.client;

import com.org.proxy.service.OrderService;
import com.org.proxy.service.TimeInvocationHandler;
import com.org.proxy.service.impl.OrderServiceImpl;
import com.org.proxy.utils.ProxyUtil;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        OrderService target = new OrderServiceImpl();

        // 创建代理对象
        OrderService proxyInstance = (OrderService) ProxyUtil.newProxyInstance(target);
        proxyInstance.generate();
    }
}
