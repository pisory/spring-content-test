package com.dada.orm.fourth.session.impl;

import com.dada.orm.fourth.jpa.Column;
import com.dada.orm.fourth.jpa.Table;
import com.dada.orm.fourth.session.Session;

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
    public <T> int update(T model) {
        if (model == null) {
            throw new RuntimeException("model is null");
        }
        StringBuilder sql = new StringBuilder();
        List<Object> parameters = new ArrayList<>();

        buildSqlAndParameter(model, sql, parameters);

        if(parameters.size() > 0) {
            return 1;
        }

        return 0;
    }

    private <T> void buildSqlAndParameter(T model, StringBuilder sql, List<Object> parameters) {
        Class<?> modelClass = model.getClass();
        String tableName = modelClass.getSimpleName();

        if (modelClass.isAnnotationPresent(Table.class)) {
            Table table = modelClass.getAnnotation(Table.class);
            String value = table.value();
            if (!"".equals(value)) {
                tableName = value;
            }
        }

        sql.append(" update ").append(tableName).append(" set ");

        Field[] fields = modelClass.getDeclaredFields();
        try {
            for (Field field : fields) {
                String fieldName = field.getName();
                if (field.isAnnotationPresent(Column.class)) {
                    Column fieldAnnotation = field.getAnnotation(Column.class);
                    String fieldValue = fieldAnnotation.value();
                    if (!"".equals(fieldValue)) {
                        fieldName = fieldValue;
                    }
                }

                field.setAccessible(true);
                Object o = field.get(model);
                if (o != null) {
                    sql.append(fieldName).append("=?,");
                    parameters.add(o);
                }
            }
            sql.deleteCharAt(sql.length() - 1);
            System.out.println(sql.toString());
            System.out.println(parameters);

            //udpate table_name set a = '" + xxx +"',b = '"+ ggg +"' where fid in (?)
            sql.append(" where fid in (?)");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
