package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /**
     * PathVariable 注解
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}", method = RequestMethod.PUT)
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println("执行了。。。");
        System.out.println(id);
        return "success";
    }

    /**
     * RequestHeader 获取请求头信息的值
     * @param header
     * @return
     */
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println("执行了。。。");
        System.out.println(header);
        return "success";
    }
}
