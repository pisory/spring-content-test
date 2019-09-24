package com.dada.orm.third.session.impl;

import com.dada.orm.third.jpa.Column;
import com.dada.orm.third.jpa.Table;
import com.dada.orm.third.session.Session;

import java.lang.reflect.Field;
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
        if (model == null) {
            throw new RuntimeException(" model is null");
        }

        StringBuilder sql = new StringBuilder();
        List<Object> parameters = new ArrayList<>();

        buildSqlAndParameters(model, sql, parameters);


        if(parameters.size() > 0) {
            return 1;
        }
        return 0;
    }

    private <T> void buildSqlAndParameters(T model, StringBuilder sql, List<Object> parameters) {
        Class<?> clazz = model.getClass();
        //表名
        String tableName = clazz.getSimpleName();
        if (clazz.isAnnotationPresent(Table.class)) {
            Table table = clazz.getAnnotation(Table.class);
            if (!"".equals(table)) {
                tableName = table.value();
            }
        }

        sql.append("insert into ").append(tableName).append("(");

        //列名
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                String fieldName = field.getName();
                if (field.isAnnotationPresent(Column.class)) {
                    Column filedValue = field.getAnnotation(Column.class);
                    if (!"".equals(filedValue)) {
                        fieldName = filedValue.value();
                    }
                }

                field.setAccessible(true);
                Object o = field.get(model);
                if (o != null) {
                    sql.append(fieldName).append(",");
                    parameters.add(o);
                }
            }

            sql.deleteCharAt(sql.length() - 1).append(") values (");
            for (Object parameter : parameters) {
                sql.append("?,");
            }
            sql.deleteCharAt(sql.length() - 1).append(")");
            System.out.println("sql -------->" + sql.toString());
            System.out.println("paramters--->" + parameters);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //列别名

        //列值

        //sql拼接


    }
}
