package com.org.pojo;

public class UserClass {
    private String name;

    @Override
    public String toString() {
        return "UserClass{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
