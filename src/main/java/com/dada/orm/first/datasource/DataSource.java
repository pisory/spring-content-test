package com.dada.orm.first.datasource;

import java.sql.Connection;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public interface DataSource {

    String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    String URL = "jdbc:mysql://127.0.0.1:3306/test?useSSL=fase";
    String USERNAME = "root";
    String PASSWORD = "root";
    Connection getDataSource();
}
