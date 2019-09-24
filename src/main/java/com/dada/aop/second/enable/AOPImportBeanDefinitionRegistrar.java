package com.dada.aop.second.enable;

import com.dada.aop.second.proxy.MyBeanPostProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class AOPImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(AOPImportBeanDefinitionRegistrar.class);
        AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
        beanDefinition.setBeanClass(MyBeanPostProcessor.class);
        beanDefinitionRegistry.registerBeanDefinition("myBeanPostProcessor", beanDefinition);
    }
}
