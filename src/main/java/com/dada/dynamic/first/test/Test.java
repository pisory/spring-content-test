package com.dada.dynamic.first.test;

import com.dada.dynamic.first.handler.MyInvocationHandler;
import com.dada.dynamic.first.proxy.DynamicProxy;
import com.dada.dynamic.first.interfaces.SubjectService;
import com.dada.dynamic.first.interfaces.impl.SubjectServiceImpl;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class Test {
    public static void main(String[] args) {
        SubjectService service = new SubjectServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(service);
        SubjectService proxy = DynamicProxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), handler);
        proxy.doOne();
        proxy.doTwo();
    }
}
