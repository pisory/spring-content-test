package com.dada.orm.first.service.impl;

import com.dada.orm.first.builder.BuilderService;
import com.dada.orm.first.builder.impl.BuilderServiceImpl;
import com.dada.orm.first.service.BaseService;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class BaseServiceImpl implements BaseService {

    private BuilderService builderService = new BuilderServiceImpl();

    @Override
    public <T> int save(T model) {
        return builderService.save(model);
    }
}
