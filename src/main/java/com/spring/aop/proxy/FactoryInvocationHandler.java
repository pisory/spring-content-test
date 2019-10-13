package com.spring.aop.proxy;

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

        Object object = method.invoke(proxy,args);

        return null;
    }
}
