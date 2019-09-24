package com.dada.aop.useAop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
@Configuration
@ComponentScan("com.dada.aop.useAop")
@EnableAspectJAutoProxy
public class Config {
    public Config() {
        System.out.println("------加载配置，初始化spring容器---------");
    }
}
