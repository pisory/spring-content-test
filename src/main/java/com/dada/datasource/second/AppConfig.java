package com.dada.datasource.second;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhoudahua
 * @date 2019/6/20
 * @description
 */
@Configuration
@EnableAspectJAutoProxy
@Aspect
@ComponentScan("com.dada.datasource.second")
public class AppConfig {
}
