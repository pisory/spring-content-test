package com.work.aop.first.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/7/3
 * @description
 */
@Component
@Aspect
public class Aspectj {
    @Pointcut("within(com.work.aop..*)")
    private void inPoint() {}

    @AfterThrowing(pointcut = "inPoint()",throwing = "exception")
    private void around(Throwable exception){
        System.out.println("4444444444");
        System.out.println(exception.getMessage());
        System.out.println("5555555555");
    }
}
