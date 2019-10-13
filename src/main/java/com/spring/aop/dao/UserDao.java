package com.spring.aop.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

public interface UserDao {
    @Select("select * form user_table where name=xxx")
    void getUser(String name);
}
