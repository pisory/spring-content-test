package com.dada.spring.processor.dao;

import com.dada.spring.processor.annotation.MySelect;

/**
 * @author zhoudahua
 * @date 2019/7/9
 * @description
 */
public interface UserDao {
    @MySelect("select * from act_ru_deploy")
    void query();
}
