package com.dada.orm.first.builder.impl;

import com.dada.orm.first.builder.BuilderService;
import com.dada.orm.first.datasource.DataSource;
import com.dada.orm.first.datasource.impl.DataSourceImpl;
import com.dada.orm.first.jpa.Column;
import com.dada.orm.first.jpa.Table;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class BuilderServiceImpl implements BuilderService {

    private DataSource dataSource;

   /* public BuilderServiceImpl() {
        dataSource = new DataSourceImpl();
    }*/

    @Override
    public <T> int save(T model) {
        int row = 0;
        if(model == null) {
            throw new RuntimeException("model is null");
        }
        StringBuilder sqlBuilder = new StringBuilder();
        List<Object> parameters = new ArrayList<>();

        buildSqlAndParameters(model, sqlBuilder, parameters);

        if(parameters.size() > 0) {
            row = 1;
        }
        /*try(
                Connection connection = dataSource.getDataSource();
                PreparedStatement pt = connection.prepareStatement(sqlBuilder.toString())
        ) {
            if (parameters.size() > 0) {
                //设置参数
                for (int i = 0; i < parameters.size(); i++) {
                    pt.setObject(i +1, parameters.get(i));
                }
            }

            //执行SQL
            row = pt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        return row;
    }

    /**
     * 通过反射和注解做映射关系
     * 构建参数和Sql
     * @param model
     * @param sqlBuilder
     * @param parameters
     * @param <T>
     */
    private <T> void buildSqlAndParameters(T model, StringBuilder sqlBuilder, List<Object> parameters) {
        Class<?> clazz = model.getClass();
        
        //获取表名
        String tableName = clazz.getSimpleName();
        //判断是否有别名
        if (clazz.isAnnotationPresent(Table.class)) {
            Table table = clazz.getAnnotation(Table.class);
            String tableValue = table.value();
            if (!"".equals(tableValue)) {
                tableName = tableValue;
            }
        }

        //设置SQL
        sqlBuilder.append(" insert into ").append(tableName).append(" (");

        //先获取类的所有字段
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                //获取字段名称
                String fieldName = field.getName();
                String columnName = fieldName;
                //获取字段别名
                if (clazz.isAnnotationPresent(Column.class)) {
                    Column column = clazz.getAnnotation(Column.class);
                    String columnValue = column.value();
                    if (!"".equals(columnValue)) {
                        columnName = columnValue;
                    }
                }
                //开启每一个字段的权限，获取它们的值
                field.setAccessible(true);
                Object fieldValue = field.get(model);
                if(fieldValue != null) {
                    sqlBuilder.append(fieldName).append(",");
                    parameters.add(fieldValue);
                }
            }
            sqlBuilder.deleteCharAt(sqlBuilder.length() -1).append(")  values (");

            //构建占位符
            for (Object parameter : parameters) {
                sqlBuilder.append("?,");
            }
            sqlBuilder.deleteCharAt(sqlBuilder.length() -1).append(")");
            System.out.println("Sql ==========>"+sqlBuilder.toString());
            System.out.println(" Parameter ====>"+parameters);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
