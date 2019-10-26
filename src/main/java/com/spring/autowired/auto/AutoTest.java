package com.spring.autowired.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dada
 * @date 2019/10/9
 * @description
 */
public class AutoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoAppconfig.class);
        System.out.println(applicationContext.getBean(AutoAppconfig.class));
    }
}
