package com.dada.datasource.second;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zhoudahua
 * @date 2019/5/29
 * @description
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSource();
    }
}
