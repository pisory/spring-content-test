package com.dada.spring.second.dao;

import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void query() {
        System.out.println("query in dao");
    }
}
