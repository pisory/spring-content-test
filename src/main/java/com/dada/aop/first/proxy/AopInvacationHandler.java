package com.dada.aop.first.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: zhoudahua
 * @Version: 2019年05月08日
 * @Description:
 */
public class AopInvacationHandler implements InvocationHandler {

    Object targer;

    public AopInvacationHandler(Object targer) {
        this.targer = targer;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("-----------(切入点之前)这里是使用代理对象调用原对象的方法（也就是动态代理的调用）---");
        Object result = method.invoke(targer, objects);
        System.out.println("-----------(切入点之后)这里是使用代理对象调用原对象的方法（也就是动态代理的调用）---");
        return result;
    }
}
