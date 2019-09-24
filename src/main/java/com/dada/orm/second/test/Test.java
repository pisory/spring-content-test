package com.dada.orm.second.test;

import com.dada.orm.second.model.User;
import com.dada.orm.second.service.BaseService;
import com.dada.orm.second.service.impl.BaseServiceImpl;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setName("zhoudahua");
        user.setSex("男");
        user.setAge(16);
        user.setPhone("13172498888");
        BaseService baseService = new BaseServiceImpl();
        int result = baseService.save(user);
        System.out.println(result == 1?"添加成功":"添加失败");
    }
}
