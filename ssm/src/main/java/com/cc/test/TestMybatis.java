package com.cc.test;

import com.cc.dao.AccountDao;
import com.cc.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    /**
     * 测试查询
     * @throws Exception
     */
    @Test
    public void run1() throws Exception {
        // 加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 创建 SqlSessionFactory 对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 创建 SqlSession 对象
        SqlSession session = factory.openSession();

        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        // 查询所有信息
        List<Account> accounts = dao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }

        // 关闭资源
        session.close();
        is.close();
    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception {
        // 加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 创建 SqlSessionFactory 对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 创建 SqlSession 对象
        SqlSession session = factory.openSession();

        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        // 保存
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(999d);
        dao.saveAccount(account);

        // 提交事物
        session.commit();

        // 关闭资源
        session.close();
        is.close();
    }
}
