package com.cc.service.impl;

import com.cc.dao.AccountDao;
import com.cc.domain.Account;
import com.cc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户。。。");
        return accountDao.findAll();
    }

    /**
     * 保存账户
     *
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户。。。");
        accountDao.saveAccount(account);
    }
}
