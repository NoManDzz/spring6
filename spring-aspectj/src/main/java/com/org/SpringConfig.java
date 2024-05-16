package com.org;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.org.service")
@EnableAspectJAutoProxy(proxyTargetClass = true) //<aop:aspectj-autoproxy/>
public class SpringConfig {
}
