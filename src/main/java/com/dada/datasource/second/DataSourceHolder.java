package com.dada.datasource.second;

import org.springframework.util.Assert;

/**
 * @author zhoudahua
 * @date 2019/5/29
 * @description
 */
public class DataSourceHolder {
    private static final ThreadLocal<String> dataSource = new ThreadLocal<>();

    public static void setDataSource(String dataSourceKey) {
        Assert.notNull(dataSourceKey, "dataSource can not null");
        dataSource.set(dataSourceKey);
    }

    public static ThreadLocal<String> getDataSource() {
        return dataSource;
    }

    public static void clear() {
        dataSource.remove();
    }
}
