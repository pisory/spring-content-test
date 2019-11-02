package com.spring.autowired.destroy;

import org.springframework.stereotype.Component;

/**
 * @author dada
 * @date 2019/10/26
 * @description
 */
@Component
public class BeanService {

    public void shutdown() {
        System.out.println("this is close method");
    }

}
