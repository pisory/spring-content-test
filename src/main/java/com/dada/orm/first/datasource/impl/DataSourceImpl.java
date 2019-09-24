package com.dada.orm.first.datasource.impl;

import com.dada.orm.first.datasource.DataSource;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class DataSourceImpl implements DataSource {

    static{
        try {
            //注册驱动
            Driver driver = (Driver) Class.forName(DRIVER_CLASS).newInstance();
            DriverManager.registerDriver(driver);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Connection getDataSource() {
        Connection connection = null;
        try {
            //创建连接
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
