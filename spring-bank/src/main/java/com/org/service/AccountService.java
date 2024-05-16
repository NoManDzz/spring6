package com.org.service;

import com.org.pojo.Account;

public interface AccountService {

    /**
     * 转账业务
     *
     * @param fromAccountId 从这个账号转出
     * @param toAccountId   这个账号转入
     * @param money         转账金额
     */
    void transfer(Integer fromAccountId, Integer toAccountId, double money);

}
