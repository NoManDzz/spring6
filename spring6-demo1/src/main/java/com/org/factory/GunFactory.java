package com.org.factory;

import com.org.pojo.Gun;

public class GunFactory {
    public Gun get() {
        System.out.println("gun factory");
        return new Gun();
    }
}
