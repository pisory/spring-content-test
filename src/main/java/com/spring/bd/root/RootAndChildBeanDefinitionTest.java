package com.spring.bd.root;

import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 了解RootBeanDefinition和ChildBeanDefinition的用法
 *
 * RootBeanDefinition一般是作为父BD,或者一个真是的BD
 * 但它不能有父BD,设置了会抛异常;
 * 它在spring中mergeBD的时候，会作为父BD，GenericBD是无法做到的
 *
 * ChildBeanDefinition可以被Generic完全替代
 *
 * @author dada
 * @date 2019/10/26
 * @description
 */
public class RootAndChildBeanDefinitionTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(RootConfig.class);

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(Root.class);
//        rootBeanDefinition.setAbstract(true);
//        rootBeanDefinition.setBeanClassName("root");
        rootBeanDefinition.getPropertyValues().add("name", "tony");

        ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("root");
        childBeanDefinition.setBeanClass(Child1.class);
        childBeanDefinition.getPropertyValues().add("name", "sindy");

        applicationContext.registerBeanDefinition("root",rootBeanDefinition);
        applicationContext.registerBeanDefinition("child",childBeanDefinition);

        applicationContext.refresh();

        System.out.println(applicationContext.getBean("root"));
        System.out.println(applicationContext.getBean("child"));

        Root root = (Root)applicationContext.getBean("root");
        Child1 child = (Child1)applicationContext.getBean("child");
        System.out.println(root.getName());
        System.out.println(child.getName());
    }
}
