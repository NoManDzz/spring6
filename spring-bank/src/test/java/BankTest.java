import com.org.SpringConfig;
import com.org.pojo.Account;
import com.org.service.AccountService;
import com.org.service.impl.IsolationService1;
import com.org.service.impl.IsolationService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = context.getBean("accountServiceImpl", AccountService.class);
        try {
            accountService.transfer(1, 2, 2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService1 iso1 = context.getBean("isolationService1", IsolationService1.class);
        iso1.getById(1);
    }

    @Test
    public void test03() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService2 iso2 = context.getBean("isolationService2", IsolationService2.class);
        Account acc = new Account(null, "003", 30000d);
        iso2.saveAccount(acc);
    }

    @Test
    public void test04() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean("accountServiceImpl", AccountService.class);
        try {
            accountService.transfer(1, 2, 2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
