package com.dada.spring.db.test;

import com.dada.spring.db.config.ThirdAppConfig;
import com.dada.spring.db.dao.DBDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO: 这个方法注册bean有问题
 * @author zhoudahua
 * @date 2019/7/15
 * @description
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ThirdAppConfig.class);
        applicationContext.getBean(DBDao.class).query();
    }
}
