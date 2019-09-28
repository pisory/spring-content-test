package com.dada.spring.aspect.service;

import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/7/3
 * @description
 */
@Component
public class ServiceImpl implements Service {
    @Override
    public void say() {
        int a = 1 / 0;
    }

    public void test() throws Exception{

    }
}
