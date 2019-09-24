package com.work.aop.other.test;

import com.dada.orm.seventh.jpa.Table;
import com.work.aop.other.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhoudahua
 * @date 2019/7/3
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("application-aop.xml");
        PersonService personService =(PersonService)context.getBean("personService");
        personService.savePerson();
    }
}
