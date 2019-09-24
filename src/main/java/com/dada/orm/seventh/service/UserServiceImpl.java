package com.dada.orm.seventh.service;

import com.dada.orm.seventh.model.User;
import com.dada.orm.seventh.session.Session;
import com.dada.orm.seventh.session.SessionImpl;

/**
 * @author zhoudahua
 * @date 2019/6/16
 * @description
 */
public class UserServiceImpl implements UserService {
    Session session = new SessionImpl();

    @Override
    public void save(User user) {
        session.insert(user);
    }
}
