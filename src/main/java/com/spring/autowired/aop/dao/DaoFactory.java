package com.spring.autowired.aop.dao;

import com.spring.autowired.aop.proxy.FactoryInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author dada
 * @date 2019/10/20
 * @description
 */
public class DaoFactory {

    public static Object getMapper(Class clazz) {
        Class[] classes = {clazz};
        Object proxyInstance = Proxy.newProxyInstance(DaoFactory.class.getClassLoader(), classes, new FactoryInvocationHandler());
        return proxyInstance;
    }

}
