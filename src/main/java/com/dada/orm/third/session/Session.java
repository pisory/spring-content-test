package com.dada.orm.third.session;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public interface Session {
    <T> int save(T model);
}
