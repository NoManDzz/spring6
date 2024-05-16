import com.org.Spring6Config;
import com.org.dao.UserDao;
import com.org.pojo.User;
import org.mac.SpringConfig;
import org.mac.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test01() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        User user = app.getBean("user", User.class);
        System.out.println(user);
        UserDao userDao = app.getBean("userDao", UserDao.class);
        System.out.println(userDao);
    }

    @org.junit.Test
    public void test02() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-select.xml");
    }

    @org.junit.Test
    public void test03() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-auto.xml");
        OrderService orderService = app.getBean("orderService", OrderService.class);
        orderService.generate();
    }



    @org.junit.Test
    public void test05() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
