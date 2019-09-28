package com.dada.bean.first.test;

import com.dada.bean.first.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用@Configutation + @ComponentScan注解
 * 扫描加载注解指定包名下的所有的bean
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    }
}
