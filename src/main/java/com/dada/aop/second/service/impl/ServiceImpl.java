package com.dada.aop.second.service.impl;

import com.dada.aop.second.service.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
@Component("service")
public class ServiceImpl implements Service {
    @Override
    public void doSomeThing() {
        System.out.println("this is service !");
    }
}
