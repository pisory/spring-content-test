package com.dada.orm.fourth.session;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public interface Session {
    <T> int update(T model);
}
