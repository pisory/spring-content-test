package com.spring.autowired.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class IndexService implements InitializingBean {

    @Autowired
    private DetailService detailService;

  /*  public IndexService() {
        System.out.println("this is IndexService");
    }*/

   @PostConstruct
    public void testConstruct() {
        System.out.println("this is constructor");
    }

    public void init() {
        System.out.println("this is init-method");
    }

    public void getService(){
        System.out.println(detailService);
    }

    public void setDetailService(DetailService detailService) {
        this.detailService = detailService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is InitializingBean properties set method");
    }
}
