package com.dada.orm.second.jpa;

import java.lang.annotation.*;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Table {
    String value() default "";
}
