package com.dada.dynamic.second.interfaces.impl;

import com.dada.dynamic.second.interfaces.Subject;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class SubjectImpl implements Subject {
    @Override
    public void doFirst() {
        System.out.println("this is first");
    }

    @Override
    public void doSecond() {
        System.out.println("this is second");
    }
}
