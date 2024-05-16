package com.org.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3) // 越小 执行顺序越高
public class SecurityAspect {

    @Before("com.org.service.LogAspect.commonPoint()")
    public void before() {
        System.out.println("security before");
    }
}
