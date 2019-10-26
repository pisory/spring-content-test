package com.spring.bd;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 了解BeanDefinition，并且了解如何修改一个BeanDefinition
 * 学会使用applicationContext修改BeanDefinition
 * @author dada
 * @date 2019/10/26
 * @description
 */
public class GenericBeanDefinitionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BDConfig.class);

        //手动定义一个BeanDefinition，并且注册到spring容器当中
        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(BDService.class);
        bd.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
        bd.setScope(BeanDefinition.SCOPE_SINGLETON);

        //这句话实际是往BeanDefinitionMap中put了一个BeanDefinition
        //private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap(256);
        //this.beanDefinitionMap.put(beanName, beanDefinition);
        applicationContext.registerBeanDefinition("bdService",bd);
        applicationContext.refresh();

        System.out.println(applicationContext.getBean("bdService"));

    }
}
