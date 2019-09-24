package com.dada.spring.first.dao;

/**
 * 自己写一个BeanFacotry，实现IOC注入对象
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
public class UserDaoImpl1 implements UserDao {
    @Override
    public void query() {
        System.out.println("this is userDao  111111~");
    }
}
