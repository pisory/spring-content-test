package com.dada.bean.second.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class Test {
    public static void main(String[] args) {
        //使用包名路径加载该包名下所有的类
        ApplicationContext context = new AnnotationConfigApplicationContext("com.dada.bean.second");

    }
}
