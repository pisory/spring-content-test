package com.dada.aop.second.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----------before---------");
        Object result = method.invoke(this.target, args);
        System.out.println("-----------after---------");
        return result;
    }
}
