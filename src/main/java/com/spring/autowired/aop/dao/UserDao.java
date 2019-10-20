package com.spring.autowired.aop.dao;

import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * form user_table where name=xxx")
    void getUser();
}
