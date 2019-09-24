package com.dada.spring.processor.config;

import com.dada.spring.processor.annotation.MyMapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoudahua
 * @date 2019/7/9
 * @description
 */
@Configuration
@ComponentScan("com.dada.processor")
@MyMapperScan
public class AppConfig {

}
