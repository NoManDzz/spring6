package com.org.proxy.service.impl.sub;

import com.org.proxy.service.impl.OrderServiceImpl;

public class OrderServiceImplSub extends OrderServiceImpl {
    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println(begin - end);
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();

        super.modify();
        long end = System.currentTimeMillis();
        System.out.println(begin - end);

    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        super.detail();
        long end = System.currentTimeMillis();
        System.out.println(begin - end);
    }
}
