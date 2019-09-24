package com.dada.aop.first.config;

import com.dada.aop.first.enableAop.EnableAop;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



/**
 * 1.@Configuration 从 spring3.0 开始使用，用来定义配置类，替换掉xml配置文件，被注解的类内部可以包含多个被@bean注解
 * 的方法，这些方法会被 AnnotationConfigApplication 类 AnnotationConfigWebApplicationContext 类扫描，并用于构建
 * bean，初始化spring容器。这个类也是我们使用spring容器时最先开始跑的类
 * 2.使用方式
 *      2.1、@Configuration配置spring并启动spring容器
 *      2.2、@Configuration启动容器+@Bean注册Bean
 *      2.3、@Configuration启动容器+@Component注册Bean
 *      2.4、使用 AnnotationConfigApplicationContext 注册 AppContext 类的两种方法
 *      2.5、配置Web应用程序(web.xml中配置AnnotationConfigApplicationContext)
 * 3.组合多个配置类
 *      3.1、在@configuration中引入spring的xml配置文件
 *      3.2、在@configuration中引入其它注解配置
 *      3.3、@configuration嵌套（嵌套的Configuration必须是静态类）
 * 4.@EnableXXX注解
 *
 * 5.@EnableAspectJAutoProxy:开启AOP
 *
 * 6.@EnableAop：自己写的织入方法
 * @Author: zhoudahua
 * @Version: 2019年05月07日
 * @Description:
 */
@Configuration
@ComponentScan("com.dada.aop.first")
@EnableAop
@EnableAspectJAutoProxy
public class TestAppConfig {
    public TestAppConfig() {
        System.out.println("-------------开始配置和初始化Spring容器(应用上下文)-------------------");
    }
}
