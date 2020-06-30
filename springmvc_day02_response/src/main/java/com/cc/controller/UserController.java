package com.cc.controller;

import com.cc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值是 string
     * @param model
     * @return
     */
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

    /**
     * 返回值是 ModelAndView
     * @param
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {

        //创建 ModelAndView 对象
        ModelAndView mv = new ModelAndView();

        System.out.println("testModelAndView 执行了。。。");

        //模拟从数据库中查询出 User 对象
        User user = new User();
        user.setUsername("欢欢");
        user.setPassword("456");
        user.setAge(30);

        //把 user 对象存储到 mv 对象中，也会把 user 对象存入到 request 对象
        mv.addObject("user", user);

        //跳转到哪个页面
        mv.setViewName("success");

        return mv;
    }

    /**
     * 返回值是 void
     *
     * 请求转发一次请求，不用编写项目的名称
     *
     * @param request
     * @param response
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid 执行了。。。");

        //编写请求转发程序
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

        // 重定向
        //response.sendRedirect(request.getContextPath() + "/index.jsp");

        //设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //直接会进行相应
        response.getWriter().println("Hello, 程成");
        return;
    }

    /**
     * 使用关键字的方式进行转发或者重定向
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() {
        System.out.println("testForwardOrRedirect 执行了。。。");

        //请求的转发
        //return "forward:/WEB-INF/pages/success.jsp";

        //重定向
        return "redirect:/index.jsp";
    }

    /**
     * ajax 测试
     */
    @RequestMapping("/testAjax")
    public void testAjax(@RequestBody String body) {
        System.out.println("testAjax 执行了。。。");
        System.out.println(body);
    }
}
