package com.dada.spring.processor.test;

import com.dada.spring.processor.config.AppConfig;
import com.dada.spring.processor.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhoudahua
 * @date 2019/7/9
 * @description
 */
public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.query();
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        userService.find();
    }
}
