package com.work.aop.other.aspect;

import org.aspectj.lang.JoinPoint;

/**
 * @author zhoudahua
 * @date 2019/7/3
 * @description
 */
public class ExceptionAspect {
    public void throwingException(JoinPoint joinPoint, Throwable ex){
        System.out.println("222222222");
        System.out.println(ex.getMessage());
        System.out.println("333333333");
    };
}
