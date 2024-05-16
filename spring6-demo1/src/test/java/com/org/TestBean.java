package com.org;

import com.org.pojo.*;
import com.org.service.CustomerService;
import com.org.service.OrderService;
import com.org.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

    @Test
    public void test04() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("set-di.xml");
        // 获取对象
        OrderService orderService = app.getBean("orderService2", OrderService.class);
        orderService.generate();
    }

    @Test
    public void test05() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("set-di.xml");
        // 获取对象
        User user = app.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test06() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("cascade.xml");
        // 获取对象
        User user = app.getBean("user", User.class);
        UserClass userClass = app.getBean("userClass", UserClass.class);
        System.out.println(user);
        System.out.println(userClass);
    }

    @Test
    public void test07() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("cascade.xml");
        // 获取对象
        User user = app.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test08() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-p.xml");
        // 获取对象
        Person person = app.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void test09() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-c.xml");
        // 获取对象
        Dog dog = app.getBean("dog", Dog.class);
        System.out.println(dog);
    }

    @Test
    public void test10() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("sprint-auto.xml");
        // 获取对象
        OrderService orderService = app.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void test11() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("sprint-auto.xml");
        // 获取对象
        CustomerService csService = app.getBean("csService", CustomerService.class);
        csService.save();
    }

    @Test
    public void test12() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-factory.xml");
        // 获取对象
        Star star = app.getBean("star", Star.class);
        System.out.println(star);
    }

    @Test
    public void test13() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-factory.xml");
        // 获取对象
        Gun gun = app.getBean("gun", Gun.class);
        System.out.println(gun);
    }

    @Test
    public void test14() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-factory.xml");
        // 获取对象
        Woman woman = app.getBean("woman", Woman.class);
        System.out.println(woman);
    }

    @Test
    public void test15() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-factory.xml");
        // 获取对象
        Student student = app.getBean("student", Student.class);
        System.out.println(student);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) app;
    }

    @Test
    public void test18() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-life.xml");
        // 获取对象
        Cat cat = app.getBean("cat", Cat.class);
        System.out.println("第四步" + cat);

    }

    @Test
    public void test19() {
        // 获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-circular.xml");
        // 获取对象
        Husband husband = app.getBean("husband", Husband.class);
        Wife wife = app.getBean("wife", Wife.class);
        System.out.println(husband);
        System.out.println(wife);
    }

}
