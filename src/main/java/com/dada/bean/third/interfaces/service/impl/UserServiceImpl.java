package com.dada.bean.third.interfaces.service.impl;

import com.dada.bean.third.interfaces.service.UserService;

/**
 * @author zhoudahua
 * @date 2019/5/30
 * @description
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
