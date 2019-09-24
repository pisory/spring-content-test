package com.dada.bean.first.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
@Component
public class UserBean {
    public UserBean(){
        System.out.println("userBean init");
    }
}
