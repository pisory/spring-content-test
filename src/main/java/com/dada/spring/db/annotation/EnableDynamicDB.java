package com.dada.spring.db.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhoudahua
 * @date 2019/7/15
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableDynamicDB {
    String name() default "root";
    String password() default "root";
    String url() default "mysql";
}
