package com.spring.autowired.notauto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 手动配置(非自动配置)
 * 在spring-autowired.xml配置文件中，手动配置两个Service之间的依赖
 * @author dada
 * @date 2019/10/9
 * @description
 */
public class NotAutoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-notauto.xml");
        System.out.println(applicationContext.getBean(PersonService.class).getUserService());
    }
}
