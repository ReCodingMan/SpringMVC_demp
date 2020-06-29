package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    /**
     * RequestParam 注解
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("执行了。。。");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取请求体内容
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("执行了。。。");
        System.out.println(body);
        return "success";
    }
}
