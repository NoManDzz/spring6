package org.myspringframework.core;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassPathXmlApplicationContext implements ApplicationContext {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);

    private Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 解析配置文件，初始化bean
     *
     * @param configLocation 配置文件的路径 ，配置文件应该放在类路径下
     */
    public ClassPathXmlApplicationContext(String configLocation) {
        try {
            SAXReader reader = new SAXReader();
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            Document document = reader.read(is);
            List<Node> nodes = document.selectNodes("//bean");
            nodes.forEach(node -> {
                try {
                    Element element = (Element) node;
                    String id = element.attributeValue("id");
                    String className = element.attributeValue("class");
                    LOGGER.info("name:" + id);
                    LOGGER.info("className:" + className);

                    // 通过反射创建对象，放在map中，提前曝光
                    Class<?> clazz = Class.forName(className);
                    Constructor<?> constructor = clazz.getDeclaredConstructor();
                    Object object = constructor.newInstance();
                    singletonObjects.put(id, object);
                    LOGGER.info(singletonObjects.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            nodes.forEach(node -> {
                try {
                    Element element = (Element) node;
                    String id = element.attributeValue("id");
                    String className = element.attributeValue("class");
                    Class<?> clazz = Class.forName(className);
                    List<Element> propertys = element.elements("property");
                    propertys.forEach(property -> {
                        try {
                            String propertyName = property.attributeValue("name");
                            Field field = clazz.getDeclaredField(propertyName);
                            String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
                            Method method = clazz.getDeclaredMethod(setMethodName, field.getType());
                        } catch (NoSuchFieldException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) {
        return null;
    }
}
