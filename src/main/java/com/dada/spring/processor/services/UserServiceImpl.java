package com.dada.spring.processor.services;

import com.dada.spring.processor.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/7/9
 * @description
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void find() {
        userDao.query();
    }
}
