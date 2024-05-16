package com.org.factory;

import com.org.pojo.Woman;
import org.springframework.beans.factory.FactoryBean;

public class WomanFactory implements FactoryBean<Woman> {
    @Override
    public Woman getObject() throws Exception {
        return new Woman();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
