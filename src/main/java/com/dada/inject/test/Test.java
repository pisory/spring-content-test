package com.dada.inject.test;

import com.dada.inject.service.UserService;
import com.dada.inject.service.UserServiceImpl;

/**
 * @author zhoudahua
 * @date 2019/6/26
 * @description
 */
public class Test {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        service.find();
    }
}
