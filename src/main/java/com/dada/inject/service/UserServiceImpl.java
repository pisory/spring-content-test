package com.dada.inject.service;

import com.dada.inject.dao.UserDao;

/**
 * @author zhoudahua
 * @date 2019/6/26
 * @description
 */
public class UserServiceImpl implements UserService {
    UserDao dao;
    @Override
    public void find() {
        System.out.println("service");
        dao.query();
    }

    /**
     * 使用setter注入：方法名称叫setXxx:必须和ref的名称一致，开头字幕大写<property ref="dao"></property>
     * @param dao
     */
    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
