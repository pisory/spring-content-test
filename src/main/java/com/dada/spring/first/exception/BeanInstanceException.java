package com.dada.spring.first.exception;

/**
 * 自定义异常类
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
public class BeanInstanceException extends RuntimeException {

    public BeanInstanceException() {
        super();
    }

    public BeanInstanceException(String msg) {
        super(msg);
    }
}
