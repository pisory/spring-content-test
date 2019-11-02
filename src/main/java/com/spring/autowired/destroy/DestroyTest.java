package com.spring.autowired.destroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dada
 * @date 2019/10/26
 * @description
 */
public class DestroyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DestroyConfig.class);
        System.out.println(applicationContext.getBean(BeanService.class));
        applicationContext.close();
    }
}
