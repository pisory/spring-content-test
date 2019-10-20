package com.spring.autowired.init;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring容器的生命周期回调和spring容器启动/关闭回调
 * @author dada
 * @date 2019/10/13
 * @description
 */
public class InitTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-init.xml");
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitAppConfig.class);*/
        IndexService bean = applicationContext.getBean(IndexService.class);
        bean.getDetailService();
    }
}
