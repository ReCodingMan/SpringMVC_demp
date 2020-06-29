package com.cc.controller;

import com.cc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //把 msg=美美 存入到 session 域当中
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

    /**
     * RequestHeader 获取 cookie 的值
     * @param cookieValue
     * @return
     */
    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println("执行了。。。");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute 注解
     * @param user
     * @return
     */
    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("testModelAttribute 执行了。。。");
        System.out.println(user);
        return "success";
    }

    /**
     * 该方法会先执行
     */
    @ModelAttribute
    public void showUser(String uname, Map<String, User> map) {
        System.out.println("showUser 执行了。。。");
        //通过用户名查询数据库（模拟）
        User user = new User();
        user.setAge(20);
        user.setUname(uname);
        user.setDate(new Date());

        map.put("abc", user);
    }

//    /**
//     * 该方法会先执行
//     */
//    @ModelAttribute
//    public User showUser(String uname) {
//        System.out.println("showUser 执行了。。。");
//        //通过用户名查询数据库（模拟）
//        User user = new User();
//        user.setAge(20);
//        user.setUname(uname);
//        user.setDate(new Date());
//
//        return user;
//    }

    /**
     * SessionAttributes 注解
     * @param model
     * @return
     */
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("testSessionAttributes 执行了。。。");
        //底层会存储到 request 域对象中
        model.addAttribute("msg", "美美");
        System.out.println();
        return "success";
    }

    /**
     * SessionAttributes 取值
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("getSessionAttributes 执行了。。。");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * SessionAttributes 删除
     * @param sessionStatus
     * @return
     */
    @RequestMapping(value = "/delSessionAttributes")
    public String delSessionAttributes(SessionStatus sessionStatus) {
        System.out.println("delSessionAttributes 执行了。。。");
        sessionStatus.setComplete();
        return "success";
    }
}
