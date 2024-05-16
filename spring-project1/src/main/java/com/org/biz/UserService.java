package com.org.biz;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void sava() {
        System.out.println("save");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void get() {
        System.out.println("get");
    }
}
