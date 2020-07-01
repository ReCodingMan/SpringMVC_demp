package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户Web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * 查询所有账户
     * @return
     */
    @RequestMapping("findAll")
    public String findAll() {
        System.out.println("表现层：查询所有账户...");
        return "list";
    }
}
