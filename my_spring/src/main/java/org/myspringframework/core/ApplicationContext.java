package org.myspringframework.core;

public interface ApplicationContext {

    /**
     * 根据bean的名称获取bean对象
     *
     * @param beanName 配置文件中bean标签的id
     * @return 单例bean对象
     */
    Object getBean(String beanName);
}
