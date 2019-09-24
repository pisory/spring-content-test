package com.dada.orm.second.service.impl;

import com.dada.orm.second.service.BaseService;
import com.dada.orm.second.session.Session;
import com.dada.orm.second.session.impl.SessionImpl;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class BaseServiceImpl implements BaseService {

    private Session session = new SessionImpl();

    @Override
    public <T> int save(T model) {
        return session.save(model);
    }
}
