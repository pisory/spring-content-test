package com.dada.aop.second.proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
/*@Component*/
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("service")) {
            Class[] clazz = new Class[]{bean.getClass().getInterfaces()[0]};
            MyInvocationHandler handler = new MyInvocationHandler(bean);
            bean = Proxy.newProxyInstance(bean.getClass().getClassLoader(), clazz, handler);
        }
        return bean;
    }
}
