package com.org.service.impl;

import com.org.mapper.AccountMapper;
import com.org.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IsolationService2 {

    @Autowired
    private AccountMapper accountMapper;

    public void saveAccount(Account acc) {
        accountMapper.updateAccount(acc);
        try {
            Thread.sleep(1000 * 20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
