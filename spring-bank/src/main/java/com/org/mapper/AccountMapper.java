package com.org.mapper;

import com.org.pojo.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    /**
     * 根据账户id，查询账号信息
     *
     * @return
     */
    Account selectAccountById(@Param("id") Integer id);

    /**
     * 更新账号信息
     *
     * @param acc
     * @return
     */
    int updateAccount(Account acc);
}
