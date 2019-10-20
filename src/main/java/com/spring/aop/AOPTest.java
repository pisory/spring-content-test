package com.spring.aop;

import com.spring.aop.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dada
 * @date 2019/10/9
 * @description
 */
public class AOPTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPAppconfig.class);
        System.out.println(applicationContext.getBean(AOPAppconfig.class));

        //使用AOP，来模拟一个mybatis
        /*UserDao mapper = FactoryProxy.getMapper(UserDao.class);*/
//        mapper.getUser("aop");

    }
}
