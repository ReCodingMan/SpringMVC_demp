package com.cc.service;

import com.cc.domain.Account;

import java.util.List;

public interface AccountService {

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
