package com.spring.autowired.aop;

import com.spring.autowired.aop.dao.DaoFactory;
import com.spring.autowired.aop.dao.UserDao;
import com.spring.autowired.aop.proxy.FactoryInvocationHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * 使用AOP，来模拟一个mybatis
 * @author dada
 * @date 2019/10/9
 * @description
 */
public class AOPTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPAppconfig.class);
        //使用动态代理，来模拟一个mybatis
        Class[] clazz = {UserDao.class};
        UserDao proxyInstance = (UserDao)Proxy.newProxyInstance(AOPTest.class.getClassLoader(), clazz, new FactoryInvocationHandler());
        proxyInstance.getUser();
    }
}
