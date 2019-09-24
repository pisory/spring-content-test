package com.dada.aop.first.enableAop;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @EnableXXX注解
 * 1.将AOP的功能使用注解来达到目的，抛弃@Componet用法
 *
 * 2.我们自己写AopImportBeanDefinitioneRegtar，这个类是将bean动态添加到spring容器中，
 * 所以当我们使用@EnableAop时，就会加载AopImportBeanDefinitioneRegtar类，这个类中会
 * 加载AOPBeanPostProcessor，也就调用了动态代理了。
 *
 * @Author: zhoudahua
 * @Version: 2019年05月08日
 * @Description:
 */

@Retention(RetentionPolicy.RUNTIME)
@Import(AopImportBeanDefinitioneRegtar.class)
public @interface EnableAop {
}
