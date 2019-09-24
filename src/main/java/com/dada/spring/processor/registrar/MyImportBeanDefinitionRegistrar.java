package com.dada.spring.processor.registrar;

import com.dada.spring.processor.dao.UserDao;
import com.dada.spring.processor.factory.MyFactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhoudahua
 * @date 2019/7/9
 * @description
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        /**
         * 得到BeanDefinition
         * 扫描所有包
         *
         * 当我们注册UserDao进去时，因为是一个接口，所以是无法实例化的
         */
        //第一种方法，直接生成一个代理对象，但是由于UserDao无法得到代理对象的类类型，所以无法使用这个对象，所以不能用这种方法
        /*UserDao userDao = (UserDao) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{UserDao.class}, new MyInvocationHandler());
        userDao.query();*/
        //第二种方法，使用FactoryBean,返回一个类型是UserDao的Type，并且由于FactoryBean，实际返回是代理对象

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(UserDao.class);
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("UserDao");
        beanDefinition.setBeanClass(MyFactoryBean.class);
        registry.registerBeanDefinition("UserDao",beanDefinition);
    }
}
