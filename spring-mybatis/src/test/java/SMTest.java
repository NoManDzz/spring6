import com.org.pojo.User;
import com.org.service.UserService;
import com.org.service.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SMTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        User user = userService.getById(1);
        System.out.println(user);
    }
}
