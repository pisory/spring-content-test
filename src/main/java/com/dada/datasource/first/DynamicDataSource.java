package com.dada.datasource.first;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 获取动态数据源的值:实际获取到的是一个key，key - value是我们在xml中配置的数据源bean
 * 我们xml中创建的数据源都是保存在一个Map中，切换的时候是要在系统使用数据库的时候返回一个
 * 即可，key对应的是一个数据源对象value
 * @author zhoudahua
 * @date 2019/5/28
 * @description
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSource();
    }
}
