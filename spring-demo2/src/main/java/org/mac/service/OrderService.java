package org.mac.service;

import org.mac.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    /**
     * @Autowired 根据类型进行自动装配
     *
     * @Autowired
     * @Qualifier("orderDaoImpl") 两个和在一起按名字进行自动装配
     */
    @Autowired
    @Qualifier("orderDaoImpl")
    private OrderDao orderDao;

    public void generate() {
        orderDao.inset();
    }
}
