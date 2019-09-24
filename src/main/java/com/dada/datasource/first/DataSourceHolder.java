package com.dada.datasource.first;

import org.springframework.util.Assert;

/**
 * 动态数据源切换
 * @author zhoudahua
 * @date 2019/5/28
 * @description
 */
public class DataSourceHolder {

    private static final ThreadLocal<String> dataSource = new ThreadLocal<String>();

    public static void setDataSource(String dataSourceName) {
        Assert.notNull(dataSourceName,"dataSource cannot be null");
        dataSource.set(dataSourceName);
    }

    public static ThreadLocal<String> getDataSource() {
        return dataSource;
    }

    public static void clearDataSource(){
        dataSource.remove();
    }
}
