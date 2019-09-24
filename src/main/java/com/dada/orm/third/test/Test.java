package com.dada.orm.third.test;

import com.dada.orm.third.model.Person;
import com.dada.orm.third.session.Session;
import com.dada.orm.third.session.impl.SessionImpl;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPersonName("zhoudahua");
        person.setPassWord("123456");
        Session session = new SessionImpl();
        int result = session.save(person);
        System.out.println(result == 1?"成功":"失败");
    }
}
