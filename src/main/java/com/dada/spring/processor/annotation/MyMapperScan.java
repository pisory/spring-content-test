package com.dada.spring.processor.annotation;

import com.dada.spring.processor.registrar.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhoudahua
 * @date 2019/7/9
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface MyMapperScan {
    String value() default "";
}
