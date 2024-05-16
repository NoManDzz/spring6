package com.org.pojo;

public class Cat {
    private String name;

    public void initCat() {
        System.out.println("第三步");
    }

    public void destroyCat() {
        System.out.println("第五步");
    }

    public Cat() {
        System.out.println("第一步");
    }

    public void setName(String name) {
        System.out.println("第二步");
        this.name = name;
    }
}
