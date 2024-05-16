package com.org.service.impl;

import com.org.mapper.AccountMapper;
import com.org.pojo.Account;
import com.org.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    @Transactional
    public void transfer(Integer fromAccountId, Integer toAccountId, double money) {
        // 查询转出的账户余额
        Account fromAccount = accountMapper.selectAccountById(fromAccountId);
        if (fromAccount.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        Account toAccount = accountMapper.selectAccountById(toAccountId);
        // 修改余额
        fromAccount.setBalance(fromAccount.getBalance() - money);
        toAccount.setBalance(toAccount.getBalance() + money);


        // 跟新数据库
        int count = accountMapper.updateAccount(fromAccount);

        // 模拟错误
        String s = null;
        s.toString();

        count += accountMapper.updateAccount(toAccount);
        if (count != 2) {
            // 修改失败
            throw new RuntimeException("转账失败");
        }

    }


}
