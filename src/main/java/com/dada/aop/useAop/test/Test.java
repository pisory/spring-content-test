package com.dada.aop.useAop.test;

import com.dada.aop.useAop.config.Config;
import com.dada.aop.useAop.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(applicationContext.getBean(Service.class).getClass().getName());
        Service proxy = applicationContext.getBean(Service.class);
        proxy.doSomeThing();
    }
}
