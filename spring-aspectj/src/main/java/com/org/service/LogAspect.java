package com.org.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
@Aspect //标注切面类
public class LogAspect {

    //定义通用的切点表达式
    @Pointcut("execution( * com.org.service..*(..))")
    public void commonPoint() {

    }

    // execution([修饰符] 返回值类型 [全限定类名] 方法名（参数列表）[异常])
    @AfterReturning("commonPoint()")
    public void improve() {
        System.out.println("improve code");
    }


    @Around("commonPoint()")
    public void improveAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("improve code before");
        // 执行目标
        joinPoint.proceed();
        System.out.println("improve code after");
    }
}
