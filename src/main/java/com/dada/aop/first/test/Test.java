package com.dada.aop.first.test;

import com.dada.aop.first.config.TestAppConfig;
import com.dada.aop.first.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring源码详细解析(AOP部分)
 * 1.从context.getBean()方法开始debug，分析源码
 * 2.AOP主要使用了动态代理，分析时候查看代理是什么时候生成的。
 * 3.自己写一个aop，并写成一个可配置化的，需要用到切面编程 + 动态代理 + 可配置化(即@EnableXXX注解)
 * @Author: zhoudahua
 * @Version: 2019年05月07日
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestAppConfig.class);
        TestService service = annotationConfigApplicationContext.getBean(TestService.class);
        service.query();
    }
}
