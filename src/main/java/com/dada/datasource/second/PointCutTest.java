package com.dada.datasource.second;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/6/20
 * @description
 */
@Component
public class PointCutTest {

    @DataSource("aaa")
    public void test() {
        System.out.println("test");
    }
}
