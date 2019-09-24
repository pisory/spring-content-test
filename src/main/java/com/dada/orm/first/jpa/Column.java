package com.dada.orm.first.jpa;

import java.lang.annotation.*;

/**
 * 注解：实体类的字段对应数据库表的字段名称
 * (value = "数据库字段名")
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface Column {
    String value() default "";
}
