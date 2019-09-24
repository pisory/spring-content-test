package com.dada.spring.scan.test;

import com.dada.spring.scan.annotation.AnnotationConfigApplicationContexts;

/**
 * 模拟spring使用注解扫描包的机制
 * @author zhoudahua
 * @date 2019/7/7
 * @description
 */
public class MyScanAnnotationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContexts applicationContext = new AnnotationConfigApplicationContexts();
        applicationContext.scan("com.dada.a.dao");

    }
}
