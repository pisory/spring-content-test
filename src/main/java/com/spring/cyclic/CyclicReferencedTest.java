package com.spring.cyclic;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  循环引用
 * @author dada
 * @date 2019/11/2
 * @description
 */
public class CyclicReferencedTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(CyclicAppConfig.class);
        //beanFactory的子类中，可以关闭spring的循环依赖
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory)applicationContext.getBeanFactory();
        beanFactory.setAllowCircularReferences(false);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean("orderService"));
    }
}
