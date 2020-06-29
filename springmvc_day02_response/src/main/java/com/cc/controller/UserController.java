package com.cc.controller;

import com.cc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString 执行了。。。");

        //模拟从数据库中查询出 User 对象
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(30);

        model.addAttribute("user", user);
        return "success";
    }
}
