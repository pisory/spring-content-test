package com.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author dada
 * @date 2019/10/9
 * @description
 */

/**
 * 加入了@Configuration主要是保证这个类里面的bean是单例的，否则有可能会是原型的
 * 添加了@Configuration主要是使用了动态代理来实现这种结果的
 */
@Configuration
@ComponentScan("com.spring.autowired.auto")
public class AOPAppconfig {

}

