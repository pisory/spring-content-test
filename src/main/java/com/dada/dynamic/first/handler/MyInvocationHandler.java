package com.dada.dynamic.first.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类的Handler类：可以再代理类中添加自己需要的逻辑
 * 注意：每一个动态代理类都需要实现InvocationHandler这个接口
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
