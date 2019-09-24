package com.work.aop.first.test;

import com.work.aop.first.config.AppConfig;
import com.work.aop.first.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhoudahua
 * @date 2019/7/3
 * @description
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Service service = applicationContext.getBean(Service.class);
        service.say();
    }
}
