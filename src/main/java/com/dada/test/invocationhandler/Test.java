package com.dada.test.invocationhandler;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理：只能针对 实现了接口的实现类生成对象来 做代理
 * 依赖Proxy和InvocationHandler接口
 * 在原来的基础上添加一些操作(权限校验，日志记录等等)
 */
public class Test {

    public static void main(String[] args) {
        UserDao user = new UserDaoImpl();
        user.add();
        user.update();
        user.find();
        user.delete();
        System.out.println("--------------------------------------------------");
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(user);
        UserDao proxy= (UserDao) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), myInvocationHandler);
        proxy.add();
        proxy.update();
        proxy.find();
        proxy.delete();
    }
}
