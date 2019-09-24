package com.dada.dynamic.second.test;

import com.dada.dynamic.second.interfaces.Subject;
import com.dada.dynamic.second.interfaces.impl.SubjectImpl;
import com.dada.dynamic.second.proxy.SubjectDynamicProxy;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
public class TestTwo {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
    }

}
