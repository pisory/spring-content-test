package com.dada.spring.first.service;

import com.dada.spring.first.dao.UserDao;

/**
 * 自己写一个BeanFacotry，实现IOC注入对象
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
public class UserServiceImpl implements UserService {
    UserDao dao;

    /**
     * 构造器注入
     */
   /* public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }*/

    @Override
    public void find() {
        System.out.println("this is service ~");
        dao.query();
    }

    /**
     * setter注入dao
     */
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

}
