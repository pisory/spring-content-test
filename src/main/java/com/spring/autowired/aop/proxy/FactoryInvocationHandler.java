package com.spring.autowired.aop.proxy;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dada
 * @date 2019/10/13
 * @description
 */
public class FactoryInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理对象处理
        //connect db
        System.out.println("connect db");
        Select annotation = method.getAnnotation(Select.class);
        String sql = annotation.value()[0];
        System.out.println(sql);
        return null;
    }
}
