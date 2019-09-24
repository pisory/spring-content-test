package com.dada.spring.second.services;

import com.dada.spring.second.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
@Component("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public void findById() {
        System.out.println("find by Id in service");
        userDao.query();
    }
}
