package com.dada.spring.first.util;

import com.dada.spring.first.exception.BeanInstanceException;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 自己写一个BeanFacotry，实现IOC注入对象
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
public class MyBeanFactory {

    Map map = new HashMap<String, Object>();

    public MyBeanFactory(String xml) {
        parseXml(xml);
    }


    public Object getBean(String beanName) {
        return map.get(beanName);
    }

    private void parseXml(String xml) {
        try {
            /**
             * 实例化对象
             * 得到根目录，beans
             */
            String path = this.getClass().getResource("/").getPath() + File.separator + xml;
            File file = new File(path);
            SAXReader reader = new SAXReader();
            Document document = reader.read(file);
            Element rootElement = document.getRootElement();
            /**
             * 根据beans，看是否需要自动装配
             * 手动装配  > 自动装配
             */
            Attribute rootProperty = rootElement.attribute("default-autowired");
            boolean isAutowired = false;
            if(rootProperty != null) {
                isAutowired = true;
            }


            for(Iterator<Element> it = rootElement.elementIterator(); it.hasNext();) {
                Element element = it.next();
                /**
                 * 解析第一个,得到bean
                 */
                Attribute attributeId = element.attribute("id");
                String beanName = attributeId.getValue();
                Attribute attributeClass = element.attribute("class");
                String beanClass = attributeClass.getValue();
                Class<?> clazz = Class.forName(beanClass);
                Object object = null;
                /**
                 * 维护依赖关系
                 * 判断bean里面有没有属性(即bean的name="dao") + 当前这个bean的Class类里面
                 * 有没有相对于的属性(即UserServiceImpl有没有setDao这个方法和dao属性)
                 * (即两个都要有相同的属性(dao)才注入)
                 */
                for(Iterator<Element> itChild = element.elementIterator(); itChild.hasNext();) {
                    //得到 <property name="dao" ref="dao"></property> 这个bean里的属性，然后取出这个属性里面的各个值
                    Element childElement = itChild.next();

                    //判断这个是不是property属性，如果是就setter注入
                    if (childElement.getName().equals("property")) {
                        //bean属性中的class对象，这里指的是UserServiceImpl
                        object = clazz.newInstance();
                        String propertyName = childElement.attribute("name").getValue();
                        //得到ref的值(ref="dao")
                        String propertyRef = childElement.attribute("ref").getValue();
                        //bean属性
                        Object injectObject = map.get(propertyRef);
                        Field field = clazz.getDeclaredField(propertyName);
                        field.setAccessible(true);
                        field.set(object, injectObject);
                    }else if(childElement.getName().equals("constructor-arg")){
                        //证明有构造方法，使用构造方法注入
                        String refValue = childElement.attribute("ref").getValue();
                        Object injectObject = map.get(refValue);
                         Class<?> injectObjectClazz = injectObject.getClass();
                         //injectObjectClazz是ref中的dao的UserDaoImpl类型，我们注入的时候是接口注入，所以
                        // 需要将UserDaoImpl转换成接口再在构造器中注入
                        Constructor<?> constructor = clazz.getConstructor(injectObjectClazz.getInterfaces()[0]);
                        object = constructor.newInstance(injectObject);
                    }
                }
                //上面是循环bean里面的子属性，如果没有子属性，并且beans default-autowired="byType"，那么使用自动装配
                if(object == null && isAutowired) {
                    if(rootProperty.getValue().equals("byType")) {
                        Field[] fields = clazz.getDeclaredFields();
                        for (Field field : fields) {
                            //得到field的类型，用来和map的对象进行判断是否有相同的类类型
                            Class<?> injectObjectClazz = field.getType();
                            int count = 0;
                            Object injectObject = null;
                            for(Object key : map.keySet()) {
                                Class temp = map.get(key).getClass().getInterfaces()[0];
                                if(temp.getName().equals(injectObjectClazz.getName())) {
                                    injectObject = map.get(key);
                                    //记录找到一个，应为有可能找到多个
                                    count ++;
                                }
                            }

                            if(count > 1) {
                                throw new BeanInstanceException("需要一个对象，但是找到多个对象");
                            }else {
                                object = clazz.newInstance();
                                field.setAccessible(true);
                                field.set(object, injectObject);
                            }
                        }
                    }
                }
                //如果没有进入上面的if else方法，证明它没有子属性，
                // 也就是它是没有依赖其他bean的，不需要注入，那么直接实例化object出来
                if(object == null) {
                    object = clazz.newInstance();
                }
                map.put(beanName, object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
