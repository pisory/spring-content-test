package com.dada.aop.second.enable;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(AOPImportBeanDefinitionRegistrar.class)
public @interface EnableAOP {
}
