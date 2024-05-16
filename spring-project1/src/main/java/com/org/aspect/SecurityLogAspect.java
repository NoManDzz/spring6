package com.org.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class SecurityLogAspect {

    @Pointcut("execution(* com.org.biz..sava*(..))")
    public void savePoint() {
    }

    @Pointcut("execution(* com.org.biz..delete*(..))")
    public void deletePoint() {
    }


    @Before("savePoint() || deletePoint()")
    public void before(JoinPoint joinPoint) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nowTime = sdf.format(new Date());
        System.out.println(nowTime);
    }
}
