package com.dada.orm.seventh.test;

import com.dada.orm.seventh.model.User;
import com.dada.orm.seventh.service.UserService;
import com.dada.orm.seventh.service.UserServiceImpl;

/**
 * @author zhoudahua
 * @date 2019/6/16
 * @description
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setName("test");
        user.setPassword("123");
        user.setAge(12);
        user.setSex("man");

        UserService service = new UserServiceImpl();
        service.save(user);
    }
}
