package com.org.service;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public void transfer() {
        System.out.println("转账");
    }

    public void withdraw() {
        System.out.println("取款");
    }
}
