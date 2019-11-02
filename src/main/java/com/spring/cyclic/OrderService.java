package com.spring.cyclic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dada
 * @date 2019/11/2
 * @description
 */
@Component
public class OrderService {

    @Autowired
    UserService userService;

    public OrderService() {
        System.out.println("OrderService");
    }
}
