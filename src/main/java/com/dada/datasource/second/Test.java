package com.dada.datasource.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhoudahua
 * @date 2019/6/20
 * @description
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PointCutTest bean = applicationContext.getBean(PointCutTest.class);
        bean.test();
    }
}
