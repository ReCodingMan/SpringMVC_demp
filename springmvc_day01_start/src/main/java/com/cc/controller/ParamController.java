package com.cc.controller;

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
}
