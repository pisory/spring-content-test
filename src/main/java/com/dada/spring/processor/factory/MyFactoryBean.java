package com.dada.spring.processor.factory;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhoudahua
 * @date 2019/7/9
 * @description
 */
public class MyFactoryBean implements FactoryBean, InvocationHandler {
    Class clazz;

    public MyFactoryBean(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public Object getObject() throws Exception {
        Class[] clazzs = new Class[]{clazz};
        Object proxyInstance = Proxy.newProxyInstance(this.getClass().getClassLoader(), clazzs, this);
        return proxyInstance;
    }

    @Override
    public Class<?> getObjectType() {
        return clazz;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * 获取代理对象的类
         * 然后获取类的调用方法，然后获取调用方法使用的注解，并且打印注解的value
         */
        System.out.println("factory bean proxy");
        Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), String.class);
        Select select = method1.getDeclaredAnnotation(Select.class);
        System.out.println(select.value()[0]);
        return null;
    }
}
