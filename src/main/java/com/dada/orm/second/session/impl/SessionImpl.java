package com.dada.orm.second.session.impl;

import com.dada.orm.first.jpa.Column;
import com.dada.orm.first.jpa.Table;
import com.dada.orm.second.session.Session;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class SessionImpl implements Session {
    @Override
    public <T> int save(T model) {
        int result = 0;
        if (model == null) {
            throw new RuntimeException("传入对象为null");
        }
        //生成Sql
        StringBuilder sbSQL = new StringBuilder();
        List<Object> parameter = new ArrayList<>();

        //设置Sql和参数
        buildSqlAndParameter(model, sbSQL, parameter);

        //连接数据库,并更新sql
        if (parameter.size() > 0) {
            result = 1;
        }
        /*try (
                Connection con = DriverManager.getConnection("","","");
                PreparedStatement pst = con.prepareStatement(sbSQL.toString());
                ){
            if (parameter.size() >0) {
                for (int i = 0; i < parameter.size(); i++) {
                    pst.setObject(i + 1, parameter.get(i));
                }
            }
            result = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return result;
    }

    private <T> void buildSqlAndParameter(T model, StringBuilder sbSQL, List<Object> parameter) {
        Class<?> clazz = model.getClass();
        //获取表名
        String tableName = clazz.getSimpleName();
        if (clazz.isAnnotationPresent(Table.class)) {
            Table table = clazz.getAnnotation(Table.class);
            String tabelValue = table.value();
            if (!"".equals(tabelValue)) {
                tableName = tabelValue;
            }
        }
        
        //拼接Sql
        sbSQL.append(" insert into ").append(tableName).append(" (");
        
        //获取列
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                //获取列名
                String columnName = field.getName();
                //获取列别名
                if (field.isAnnotationPresent(Column.class)) {
                    Column column = field.getAnnotation(Column.class);
                    String columnValue = column.value();
                    if (!"".equals(columnValue)) {
                        columnName = columnValue;
                    }
                }

                //获取对象中每一列的值
                //开启权限，获取model的列的值
                field.setAccessible(true);
                Object fieldValue = field.get(model);
                if (fieldValue != null) {
                    sbSQL.append(columnName).append(",");
                    parameter.add(fieldValue);
                }
            }
            sbSQL.deleteCharAt(sbSQL.length() - 1).append(") values (");
            for (Object o : parameter) {
                sbSQL.append("?,");
            }
            sbSQL.deleteCharAt(sbSQL.length() - 1).append(")");

            System.out.println("SQL ==========> "+sbSQL.toString());
            System.out.println("Parameter ====> "+parameter);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
