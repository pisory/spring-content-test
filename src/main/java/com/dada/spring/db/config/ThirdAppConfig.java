package com.dada.spring.db.config;

import com.dada.spring.db.annotation.EnableDynamicDB;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoudahua
 * @date 2019/7/15
 * @description
 */
@Configuration
@ComponentScan("com.dada.third")
@EnableDynamicDB(name="zhoudahua",password = "123456",url = "linux")
public class ThirdAppConfig {
}
