package com.dada.orm.sixth.session.impl;

import com.dada.orm.sixth.jpa.Column;
import com.dada.orm.sixth.jpa.Table;
import com.dada.orm.sixth.session.Session;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoudahua
 * @date 2019/5/29
 * @description
 */
public class SessionImpl implements Session {
    @Override
    public <T> int save(T model) {
        if (model == null) {
            throw new RuntimeException("model can not null");
        }
        StringBuilder sql = new StringBuilder();
        List<Object> parameters = new ArrayList<>();

        buildSqlAndParameters(model, sql, parameters);

        if (parameters.size() > 0) {
            return 1;
        }

        return 0;
    }

    private <T> void buildSqlAndParameters(T model, StringBuilder sql, List<Object> parameters) {
        Class<?> modelClass = model.getClass();
        String tableName = modelClass.getSimpleName();
        if (modelClass.isAnnotationPresent(Table.class)) {
            Table table = modelClass.getAnnotation(Table.class);
            String tableValue = table.value();
            if (!"".equals(tableValue)) {
                tableName = tableValue;
            }
        }
        sql.append(" insert into ").append(tableName).append(" (");

        Field[] fields = modelClass.getDeclaredFields();
        try {
            for (Field field : fields) {
                String fieldName = field.getName();
                if (field.isAnnotationPresent(Column.class)) {
                    Column column = field.getAnnotation(Column.class);
                    String columnValue = column.value();
                    if (!"".equals(columnValue)) {
                        fieldName = columnValue;
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
                sql.append(parameter).append(",");
            }
            sql.deleteCharAt(sql.length() - 1).append(")");
            System.out.println("sql =============>"+sql);
            System.out.println("parameters ======>"+parameters);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
