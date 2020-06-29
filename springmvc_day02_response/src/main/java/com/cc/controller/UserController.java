package com.cc.controller;

import com.cc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
