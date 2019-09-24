package com.dada.dynamic.first.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 自己构造一个 生成代理对象 的类
 * (生成代理对象后，强制转成传递过来的对象的类型)
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }

}
