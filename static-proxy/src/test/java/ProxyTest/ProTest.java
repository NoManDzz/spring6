package ProxyTest;

import com.org.proxy.service.OrderService;
import com.org.proxy.service.impl.OrderServiceImpl;
import com.org.proxy.service.impl.OrderServiceProxy;
import com.org.proxy.service.impl.sub.OrderServiceImplSub;
import org.junit.Test;

public class ProTest {
    @Test
    public void test01() {
        OrderService target = new OrderServiceImpl();
        OrderService proxy = new OrderServiceProxy(target);

        proxy.generate();
    }
}
