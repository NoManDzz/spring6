package org.mac.dao.impl;

import org.mac.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {
    @Override
    public void inset() {
        System.out.println(".....");
    }
}
