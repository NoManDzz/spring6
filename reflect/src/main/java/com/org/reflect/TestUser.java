package com.org.reflect;

import java.lang.reflect.Method;

public class TestUser {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<?> clazz = Class.forName("com.org.reflect.User");

        // 获取方法
        Method method = clazz.getDeclaredMethod("setName", String.class);

        Object object = clazz.newInstance();

        method.invoke(object,"name");

        System.out.println(object);

    }
}
