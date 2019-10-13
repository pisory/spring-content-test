package com.spring.autowired.notauto;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author dada
 * @date 2019/10/9
 * @description
 */
public class PersonService {

    @Autowired
    private UserService userService;

    /*public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public UserService getUserService() {
        return userService;
    }
}
