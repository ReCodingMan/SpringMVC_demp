package com.cc.test;

import com.cc.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class TestSpring {

    @Test
    public void run1() {
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // 获取对象
        AccountService as = ac.getBean("AccountService", AccountService.class);

        // 调用方法
        as.findAll();
    }
}
