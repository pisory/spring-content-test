package com.dada.orm.seventh.session;

import com.dada.orm.seventh.jpa.Column;
import com.dada.orm.seventh.jpa.Table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoudahua
 * @date 2019/6/16
 * @description
 */
public class SessionImpl implements Session {

    @Override
    public <T> void insert(T model) {
        if (model == null) {
            throw new RuntimeException("model is null");
        }

        StringBuilder sqlBuilder = new StringBuilder();
        List<Object> parameters = new ArrayList<>();

        int result = buildSqlAndParameter(model, sqlBuilder, parameters);
        if(result > 0) {
            System.out.println("insert success");
        }
    }

    private <T> int buildSqlAndParameter(T model,StringBuilder sql, List<Object> parameters){
        Class<?> clazz = model.getClass();
        String tableName = clazz.getSimpleName();
        if (clazz.isAnnotationPresent(Table.class)) {
            Table table = clazz.getAnnotation(Table.class);
            String tableValue = table.value();
            if (!"".equals(tableValue)) {
                tableName = tableValue;
            }
        }

        sql.append(" insert into ").append(tableName).append(" (");

        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                //列的别名
                String columnName = field.getName();
                if (field.isAnnotationPresent(Column.class)) {
                    Column column = field.getAnnotation(Column.class);
                    String columnValue = column.value();
                    if (!"".equals(columnValue)) {
                        columnName = columnValue;
                    }
                }

                field.setAccessible(true);
                Object fieldValue = field.get(model);
                if (fieldValue != null) {
                    sql.append(columnName).append(",");
                    parameters.add(fieldValue);
                }
            }
            sql.deleteCharAt(sql.length() - 1).append(") value (");
            for (Object parameter : parameters) {
                sql.append("?,");
            }
            sql.deleteCharAt(sql.length() - 1).append(")");
            System.out.println("sql ===>" + sql);
            System.out.println("par ===>" + parameters);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
