package com.work.aop.other.dao;

/**
 * @author zhoudahua
 * @date 2019/7/3
 * @description
 */
public class PersonDaoImp implements PersonDao{
    @Override
    public void savePerson() {
        int a = 1/0;
    }

    @Override
    public void updatePerson() {
        Long.parseLong("aaa");
    }
}
