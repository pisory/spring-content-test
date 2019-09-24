package com.dada.spring.db.dao;

import com.dada.spring.db.config.ConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhoudahua
 * @date 2019/7/15
 * @description
 */

@Component
public class DBDao {
    @Autowired
    private ConfigUtil configUtil;
    public void query() {
        System.out.println(configUtil.out());
    }
}
