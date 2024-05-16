package com.org.factory;

import com.org.pojo.Star;

public class StarFactory {
    public static Star get() {
        System.out.println("工程运行");
        return new Star();
    }
}
