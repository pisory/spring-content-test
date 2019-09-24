package com.dada.orm.second.jpa;

import java.lang.annotation.*;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface Column {
    String value() default "";
}
