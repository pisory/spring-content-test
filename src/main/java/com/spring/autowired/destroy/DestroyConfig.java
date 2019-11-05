package com.spring.autowired.destroy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author dada
 * @date 2019/10/26
 * @description
 */
@Configuration
@ComponentScan("com.spring.autowired.destroy")
@EnableDestroy
public class DestroyConfig {
}
