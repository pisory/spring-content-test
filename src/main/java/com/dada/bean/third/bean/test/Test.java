package com.dada.bean.third.bean.test;

import com.dada.bean.third.bean.bean.UserBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用xml文件注册bean，并调用bean的方法
 * @author zhoudahua
 * @date 2019/5/30
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-bean.xml");
        UserBean userBean = applicationContext.getBean(UserBean.class);
        System.out.println(userBean.getUserMessage());
    }
}
