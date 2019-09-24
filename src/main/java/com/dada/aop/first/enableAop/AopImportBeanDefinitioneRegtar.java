package com.dada.aop.first.enableAop;

import com.dada.aop.first.beanPostProcessor.AOPBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * 为spring动态添加bean
 *
 * 1.该类是用来处理Enable使用的，将实现它可以让它使用@Enable，
 *   这样AOPBeanPostProcessor这个类就不用加入到容器当中，也就是不用加@Component这个注解了
 *   注意：实际当中@EnableAspectJAutoProxy这个注解下面的@Import({AspectJAutoProxyRegistrar.class})这个类也是
 *   用了同样的方法来为spring动态添加bean的
 *
 * 2.由原来 bean 用 @Componet 交给spring来处理，
 *   我们写成用@EnableAop注解的方式来处理(达到了我们需要的时候，引入@EnableAop就使用，不需要的时候不引@EnableAop就可以不用的目的)
 *   否则，使用@Componet将bean交给spring处理的话，则永远会AOP
 *
 * @Author: zhoudahua
 * @Version: 2019年05月08日
 * @Description:
 */
@EnableAspectJAutoProxy
public class AopImportBeanDefinitioneRegtar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(AOPBeanPostProcessor.class);
        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        beanDefinition.setBeanClass(AOPBeanPostProcessor.class);
        registry.registerBeanDefinition("aopBeanPostProcessor",beanDefinition);
    }
}
