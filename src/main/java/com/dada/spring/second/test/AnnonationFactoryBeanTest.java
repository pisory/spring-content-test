package com.dada.spring.second.test;

import com.dada.spring.second.bean.TempDaoFactoryBean;
import com.dada.spring.second.config.ConfigApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 为什么要初始化环境？
 * 把我们交给spring的类实例化
 * 有三种方法：
 * xml              ClassPathXmlApplicationContext
 * annotation
 * javaconfig       AnnotationConfigApplicationContext
 *
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
public class AnnonationFactoryBeanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);
        /**
         * FactoryBean是一个bean，BeanFactory是bean工厂
         * DaoFactoryBean实现了FactoryBean，那么spring容器中有两个bean，一个是daoFactoryBean，另一个是&daoFactoryBean
         * 其中daoFactoryBean实际是getObject()方法返回的对象，&daoFactoryBean是该实现了FactoryBean的类
         */
        /**
         * 这个主要的用法就是第三方包的引入，例如mybatis和spring结合。这样mybatis自己用类来配置好，
         * 然后使用SqlSessionFactoryBean来返回一个对象，这个对象可以操作数据库的持久化。如果mybatis不配置好，需要我们自己
         * 去配置，那需要实例化很多bean和维护bean之间的依赖，这样我们是很难做的，如果交给第三方维护，他们使用FactoryBean来返回
         * 一个配置好的类，我们直接使用就可以了。
         */
        TempDaoFactoryBean tempDaoFactoryBean = (TempDaoFactoryBean) applicationContext.getBean("daoFactoryBean");
        tempDaoFactoryBean.test();
    }
}
