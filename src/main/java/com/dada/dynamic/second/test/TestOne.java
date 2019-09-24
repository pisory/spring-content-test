package com.dada.dynamic.second.test;

import com.dada.dynamic.second.interfaces.Subject;
import com.dada.dynamic.second.interfaces.impl.SubjectImpl;
import com.dada.dynamic.second.handler.MyInvocationHandler;
import com.dada.dynamic.second.proxy.DynamicProxy;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class TestOne {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        //使用自己写的生成代理对象的类(生成代理对象后，强制转成传递过来的对象的类型)
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        //使用原生的代理对象类
        /*Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);*/
        proxy.doFirst();
        proxy.doSecond();
    }

}
