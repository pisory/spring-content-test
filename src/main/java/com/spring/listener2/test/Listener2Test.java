package com.spring.listener2.test;

import com.spring.listener2.AppConfig;
import com.spring.listener2.controller.ProjectController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dada
 * @date 2019/11/17
 * @description
 */
public class Listener2Test {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ProjectController bean = applicationContext.getBean(ProjectController.class);
        bean.insertProject();
        applicationContext.stop();
    }
}
