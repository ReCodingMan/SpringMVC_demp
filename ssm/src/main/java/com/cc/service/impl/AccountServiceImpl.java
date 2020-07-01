package com.cc.service.impl;

import com.cc.domain.Account;
import com.cc.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户。。。");
        return null;
    }

    /**
     * 保存账户
     *
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户。。。");
    }
}
