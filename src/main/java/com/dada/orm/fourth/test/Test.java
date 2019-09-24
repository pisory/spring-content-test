package com.dada.orm.fourth.test;

import com.dada.orm.fourth.model.Person;
import com.dada.orm.fourth.session.Session;
import com.dada.orm.fourth.session.impl.SessionImpl;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("lingling");
        person.setAge(18);
        person.setSex("woman");
        Session session = new SessionImpl();
        session.update(person);
    }
}
