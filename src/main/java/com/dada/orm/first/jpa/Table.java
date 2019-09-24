package com.dada.orm.first.jpa;

import java.lang.annotation.*;

/**
 * 注解：用来声明实体类对应数据库的表的名称
 * (value = "数据库表名")
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Table {
    String value() default "";
}
