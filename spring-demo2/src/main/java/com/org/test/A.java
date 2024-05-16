package com.org.test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class A {
    public A() {
        System.out.println("AAA");
    }
}

@Service
class B {
    public B() {
        System.out.println("BBB");
    }
}

@Repository
class C {
    public C() {
        System.out.println("CCC");
    }
}

@Controller
class D {
    public D() {
        System.out.println("DDD");
    }
}
