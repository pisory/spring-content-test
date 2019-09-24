package com.dada.datasource.second;

import java.lang.annotation.*;

/**
 * @author zhoudahua
 * @date 2019/5/29
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DataSource {
    String value() default "dataSource";
}
