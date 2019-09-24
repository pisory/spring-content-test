package com.dada.spring.processor.annotation;

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
public @interface MySelect {
    String value() default "";
}
