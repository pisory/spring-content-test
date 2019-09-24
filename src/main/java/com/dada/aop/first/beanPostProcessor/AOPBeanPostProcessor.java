package com.dada.aop.first.beanPostProcessor;

import com.dada.aop.first.proxy.AopInvacationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * bean后处理器，将过滤得到的bean对象处理成代理对象
 * (将传入的bean 变成代理类 $ProxyBean)
 * @Author: zhoudahua
 * @Version: 2019年05月08日
 * @Description:
 */
public class AOPBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("service")){
            System.out.println("这是bean处理前的方法，我返回了一个原始对象");
            /*System.out.println("自己写的AOP切入方法，这是切入   前     执行的代码");*/
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //service 变成代理类
        if(beanName.equals("service")){
            Class[] clazz = new Class[]{bean.getClass().getInterfaces()[0]};
            AopInvacationHandler aopInvacationHandler = new AopInvacationHandler(bean);
            bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),clazz,aopInvacationHandler);
            System.out.println("这是bean处理后的方法，我已经返回了一个代理对象啦");
        }
        return bean;
    }
}
