package com.spring.autowired.destroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author dada
 * @date 2019/10/26
 * @description
 */
public class XXX implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition)configurableListableBeanFactory.getBeanDefinition("beanService");
        beanDefinition.setDestroyMethodName(AbstractBeanDefinition.INFER_METHOD);

    }
}
