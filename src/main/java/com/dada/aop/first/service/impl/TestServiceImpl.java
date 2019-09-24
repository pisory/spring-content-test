package com.dada.aop.first.service.impl;

import com.dada.aop.first.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhoudahua
 * @Version: 2019年05月07日
 * @Description:
 */
@Component("service")
public class TestServiceImpl implements TestService {

    @Override
    public void query() {
        System.out.println("this is query TestService !");
    }
}
