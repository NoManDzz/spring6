package com.org.proxy.utils;

import com.org.proxy.service.OrderService;
import com.org.proxy.service.TimeInvocationHandler;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Object newProxyInstance(Object target) {
        OrderService proxyInstance = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TimeInvocationHandler(target));
        return proxyInstance;
    }
}
