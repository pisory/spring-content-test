package com.dada.orm.sixth.service.impl;

import com.dada.orm.sixth.service.BaseService;
import com.dada.orm.sixth.session.Session;
import com.dada.orm.sixth.session.impl.SessionImpl;

/**
 * @author zhoudahua
 * @date 2019/5/29
 * @description
 */
public class BaseServiceImpl implements BaseService {
    @Override
    public <T> int save(T model) {
        return new SessionImpl().save(model);
    }
}
