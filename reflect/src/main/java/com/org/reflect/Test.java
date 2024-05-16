package com.org.reflect;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<?> clazz = Class.forName("com.org.reflect.SomeService");

        // 获取方法
        Method doSome = clazz.getDeclaredMethod("doSome", String.class);
        // 掉用方法
        Object object = clazz.newInstance();
        Object ret = doSome.invoke(object, "joe");
        System.out.println(ret);
    }
}
