package com.dada.spring.db.config;

import com.dada.spring.db.annotation.EnableDynamicDB;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author zhoudahua
 * @date 2019/7/15
 * @description
 */
@Configuration
public class ConfigUtil implements ImportAware {
    private String name;
    private String password;
    private String url;
    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        Map<String, Object> map = importMetadata.getAnnotationAttributes(EnableDynamicDB.class.getName());
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(map);
        this.name = attributes.getString("name");
        this.password = attributes.getString("password");
        this.url = attributes.getString("url");
        System.out.println(name);
    }

    public String out() {
        return name;
    }
}
