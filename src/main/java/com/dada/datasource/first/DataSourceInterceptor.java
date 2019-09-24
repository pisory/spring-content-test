package com.dada.datasource.first;

import lombok.Data;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author zhoudahua
 * @date 2019/5/28
 * @description
 */
public class DataSourceInterceptor {

    /**
     * joinPoint.getSignature()
     * 该方法主要是获取被代理对象的属性名称集合
     * @param joinPoint
     */
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        if (method.isAnnotationPresent(DataSource.class)) {
            DataSource dataSource = method.getAnnotation(DataSource.class);
            DataSourceHolder.setDataSource(dataSource.value());
        }
    }

    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        if (method.isAnnotationPresent(DataSource.class)) {
            DataSourceHolder.clearDataSource();
        }
    }
}
