package com.spring.autowired.auto;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author dada
 * @date 2019/10/9
 * @description
 */
@Component
public class TeacherService implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition studentService = (GenericBeanDefinition) beanFactory.getBeanDefinition("studentService");
        studentService.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
        System.out.println(studentService.getAutowireMode());

    }
}
