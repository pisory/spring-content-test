package com.spring.autowired.destroy;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author dada
 * @date 2019/11/3
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(XXX.class)
public @interface EnableDestroy {
}
