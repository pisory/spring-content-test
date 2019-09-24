package com.dada.dynamic.first.interfaces.impl;

import com.dada.dynamic.first.interfaces.SubjectService;

/**
 * 动态代理：实现类
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class SubjectServiceImpl implements SubjectService {
    @Override
    public void doOne() {
        System.out.println("this is one");
    }

    @Override
    public void doTwo() {
        System.out.println("this is two");
    }
}
