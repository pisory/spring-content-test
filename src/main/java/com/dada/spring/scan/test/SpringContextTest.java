package com.dada.spring.scan.test;

import com.dada.spring.scan.config.ConfigApp;
import com.dada.spring.scan.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 编译spring 5/x源码后，第一个测试模块
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
public class SpringContextTest {
    public static void main(String[] args) {
        //可以注入两种bean，一个是配置类，一种是实体bean注册(这两种注册bean都是同一个方法，所以需要有作用域)
        /**
         * 第一种
         */
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.query();*/
        /**
         * 第二种
         * 自己注册到spring容器中
         * 在ConfigApp中扫描类，但是AnnotationConfigApplicationContext不加入clazz，然后注册
         */
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ConfigApp.class);
        applicationContext.refresh();
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.query();*/

        /**
         * 第三种
         * 自己注册到spring容器中
         * 不扫描类，然后注册的时候扫描
         * 上面的这些其实都是一样的，只不过spring封装的时候提供多种方法而已
         */
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ConfigApp.class);
        applicationContext.scan("com.dada.a");
        applicationContext.refresh();
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.query();*/

        /**
         * 第四种
         * 自己注册到spring容器中
         * 不扫描类，然后注册
         */
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ConfigApp.class);
        applicationContext.scan("com.dada.a");
        applicationContext.refresh();
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.query();
    }
}
