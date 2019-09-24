package com.dada.spring.scan.annotation;

import java.io.File;

/**
 * @author zhoudahua
 * @date 2019/7/7
 * @description
 */
public class AnnotationConfigApplicationContexts {
    public void scan(String basePackage){
        String path = this.getClass().getResource("/").getPath();
        String basePackagePath = basePackage.replaceAll("\\.", "\\\\");
        File file = new File(path + basePackagePath);
        String[] files = file.list();
        for (String fileName : files) {
            fileName = fileName.replaceAll(".class", "");
            try {
                Class<?> clazz = Class.forName(basePackage + "." + fileName);
                if (clazz.isAnnotationPresent(MyScan.class)) {
                    MyScan annotation = clazz.getAnnotation(MyScan.class);
                    System.out.println(annotation.value());
                    System.out.println(clazz.newInstance());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
