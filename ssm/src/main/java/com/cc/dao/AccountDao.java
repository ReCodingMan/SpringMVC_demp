package com.cc.dao;

import com.cc.domain.Account;

import java.util.List;

/**
 * 账户dao接口
 */
public interface AccountDao {

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户
     */
    public void saveAccount(Account account);
}
