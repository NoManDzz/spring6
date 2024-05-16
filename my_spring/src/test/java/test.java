import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void test01() {
        ApplicationContext app = new ClassPathXmlApplicationContext("myspring.xml");
    }
}
