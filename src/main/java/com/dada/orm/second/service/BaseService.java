package com.dada.orm.second.service;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */

public interface BaseService {

    <T> int save(T model);
}
