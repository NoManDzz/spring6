package com.org;

import com.org.service.CustomerService;
import com.org.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;
import java.util.Date;

public class TestBean {

    @Test
    public void test01() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        // 获取对象
        Object userBean = app.getBean("userBean");

        Date nowTime = app.getBean("nowTime", Date.class);

        //

        System.out.println(nowTime);

        System.out.println(userBean);
    }

    @Test
    public void test02() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        // 获取对象
        UserService userService = app.getBean("userServiceBean", UserService.class);
        userService.saveUser();
    }

    @Test
    public void test03() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        // 获取对象
        CustomerService csServiceBean = app.getBean("csServiceBean", CustomerService.class);
        csServiceBean.save();
    }

}
