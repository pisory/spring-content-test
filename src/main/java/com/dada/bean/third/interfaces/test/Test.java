package com.dada.bean.third.interfaces.test;

import com.dada.bean.third.interfaces.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhoudahua
 * @date 2019/5/30
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-interfaces.xml");
        UserService messageService = applicationContext.getBean(UserService.class);
        System.out.println(messageService.getMessage());
    }
}
