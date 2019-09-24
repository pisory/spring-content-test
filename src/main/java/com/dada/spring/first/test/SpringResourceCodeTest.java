package com.dada.spring.first.test;

import com.dada.spring.first.service.UserService;
import com.dada.spring.first.util.MyBeanFactory;

/**
 * 自己写一个BeanFacotry，实现IOC注入对象
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
public class SpringResourceCodeTest {
    public static void main(String[] args) {
        MyBeanFactory beanFactory = new MyBeanFactory("spring-first.xml");
        UserService service = (UserService) beanFactory.getBean("service");
        service.find();
    }
}
