package com.dada.spring.processor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhoudahua
 * @date 2019/7/9
 * @description
 */
public class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("this is proxy");
        return method;
    }
}
