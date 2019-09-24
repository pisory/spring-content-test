package com.dada.test.cglib;

/**
 * 使用cglib代理：可以对任意类生成代理对象
 * 原理是对目标对象进行继承代理。如果目标对象被final修饰，则无法被cglib代理！！！
 * Spring框架一大特点就是AOP，Spring AOP本质就是动态代理。它是混合使用JDK和cglib的
 * 如果代理对象实现了接口，则优先使用JDK代理，没有则用cglib。
 */
public class Test {
}
