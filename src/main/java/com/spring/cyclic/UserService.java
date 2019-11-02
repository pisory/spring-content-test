package com.spring.cyclic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dada
 * @date 2019/11/2
 * @description
 */
@Component
public class UserService {

    @Autowired
    OrderService orderService;

    public UserService(){
        System.out.println("UserService");
    }
}
