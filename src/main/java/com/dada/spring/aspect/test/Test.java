package com.dada.spring.aspect.test;

import com.dada.spring.aspect.config.AppConfig;
import com.dada.spring.aspect.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
