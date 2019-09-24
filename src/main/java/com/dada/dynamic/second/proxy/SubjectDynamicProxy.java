package com.dada.dynamic.second.proxy;

import com.dada.dynamic.second.interfaces.Subject;
import com.dada.dynamic.second.handler.MyInvocationHandler;

/**
 * 这个类是封装DynamicProxy,封装成一个Subject相关的代理类，这样使用更简单
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T>T newProxyInstance(Subject subject) {

        //获取类加载器
        ClassLoader loader = subject.getClass().getClassLoader();

        //获取对象的接口
        Class<?>[] clazz = subject.getClass().getInterfaces();

        //获取handler
        MyInvocationHandler handler = new MyInvocationHandler(subject);

        return DynamicProxy.newProxyInstance(loader, clazz, handler);

        /*return DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);*/
    }

}
