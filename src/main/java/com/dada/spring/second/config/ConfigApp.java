package com.dada.spring.second.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 使用ImportResource引入配置文件
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
@Configuration
@ComponentScan("com.dada.spring.second")
@ImportResource("classpath:spring-second.xml")
public class ConfigApp {
}
