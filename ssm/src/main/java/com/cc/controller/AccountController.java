package com.cc.controller;

import com.cc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户Web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有账户
     * @return
     */
    @RequestMapping("findAll")
    public String findAll() {
        System.out.println("表现层：查询所有账户...");

        //调用 service 的方法
        accountService.findAll();
        return "list";
    }
}
