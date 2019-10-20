package com.spring.autowired.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class IndexService implements InitializingBean {

    @Autowired
    private DetailService detailService;

    /*public IndexService(DetailService detailService) {
        System.out.println("this is IndexService");
        this.detailService = detailService;
    }*/

   @PostConstruct
    public void testConstruct() {
        System.out.println("this is constructor");
    }

    public void init() {
        System.out.println("this is init-method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is InitializingBean properties set method");
    }

    public void getDetailService(){
        System.out.println(detailService);
    }
}
