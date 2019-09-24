package com.dada.datasource.first;

import java.lang.annotation.*;

/**
 * 动态数据源切换注解，value为需要的数据源
 * @author zhoudahua
 * @date 2019/5/28
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DataSource {
    String value() default "dataSource";
}
