package com.org.service.impl;

import com.org.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IsolationService1 {

    @Autowired
    private AccountMapper accountMapper;

    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void getById(Integer id) {
        System.out.println(accountMapper.selectAccountById(id));
    }


}
