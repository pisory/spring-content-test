package com.work.aop.first.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhoudahua
 * @date 2019/7/3
 * @description
 */
@Configuration
@ComponentScan("com.work")
@EnableAspectJAutoProxy
public class AppConfig {
}
