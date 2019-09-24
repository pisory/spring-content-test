package com.dada.test.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 使用Proxy和实现InvocationHandler做代理:在原来的基础上添加一些操作(权限校验，日志记录等等)
 */
public class MyInvocationHandler implements InvocationHandler {

    public Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        Object result = method.invoke(target, args);
        System.out.println("日志记录");
        return result;
    }

}
