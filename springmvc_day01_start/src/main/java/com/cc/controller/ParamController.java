package com.cc.controller;

import com.cc.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 请求参数入门
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("执行了。。。。");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    /**
     * 请求参数绑定到JavaBean中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("执行了。。。。");
        System.out.println(account);
        return "success";
    }
}
