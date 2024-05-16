package com.org.reflect;

public class SomeService {
    public void doSome() {
        System.out.println("some");
    }

    public String doSome(String s) {
        System.out.println("public String ddSome(String s)");
        return s;
    }
}
