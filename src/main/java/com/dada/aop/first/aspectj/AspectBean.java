/*
package com.dada.aop.first.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

*/
/**
 * 整个AOP需要借用到 aspectj
 *
 * 1.@aspectj: spring主要是借用了aspectj的语法，只是使用到了它的注解来支持
 *
 * 2.AOP和aspectj的区别
 *      springAOP是运行时织入的
 *      aspectj是编译时织入的
 *
 * 3.下面是springAOP的简单应用
 * @Author: zhoudahua
 * @Version: 2019年05月07日
 * @Description:
 * BeanFactory:
 * FactoryBean:
 * IOC: CurrentHashMap中取出
 *//*

@Component
@Aspect
public class AspectBean {

    @Pointcut("execution(* com.dada.aop.first.service..*.*(..))")
    public void PointCut() {
        System.out.println("point cut done ......");
    }

    @Before("PointCut()")
    public void before() {
        System.out.println("before done ......");
    }

    @After("PointCut()")
    public void after() {
        System.out.println("after done ..........");
    }
}
*/
