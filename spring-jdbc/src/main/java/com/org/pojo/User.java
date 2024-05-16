package com.org.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    private Integer age;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, Integer age, String username) {
        this.id = id;
        this.age = age;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
