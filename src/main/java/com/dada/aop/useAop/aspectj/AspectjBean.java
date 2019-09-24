package com.dada.aop.useAop.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * AOP切入：使用Aspectj来切入
 * @author zhoudahua
 * @date 2019/5/19
 * @description
 */
@Component
@Aspect
public class AspectjBean {

    /**
     * 横切点
     */
    @Pointcut("execution(* com.dada.aop.useAop.service.*.*(..))")
    private void inPoint() {}


    /**
     * 切入的方法
     */
    @Before("inPoint()")
    public void before(){
        System.out.println("do AOP before .......");
    }

    @After("inPoint()")
    public void after() {
        System.out.println("do AOP after ......");
    }
}
