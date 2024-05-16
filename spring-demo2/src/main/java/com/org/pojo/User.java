package com.org.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Component默认名称为类名首字母小学 user
 */
@Component
public class User {


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Value("joe")
    private String name;
}
