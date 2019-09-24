package com.dada.datasource.second;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author zhoudahua
 * @date 2019/5/29
 * @description
 */
public class DataSourceInterceptor {

    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        if (method.isAnnotationPresent(DataSource.class)) {
            DataSource dataSourceName = method.getAnnotation(DataSource.class);
            DataSourceHolder.setDataSource(dataSourceName.value());
            System.out.println("before");
        }
    }

    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        if (method.isAnnotationPresent(DataSource.class)) {
            DataSourceHolder.clear();
            System.out.println("after");
        }
    }

}
