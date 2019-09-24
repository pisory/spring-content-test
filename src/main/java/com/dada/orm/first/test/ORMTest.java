package com.dada.orm.first.test;

import com.dada.orm.first.service.BaseService;
import com.dada.orm.first.service.impl.BaseServiceImpl;
import com.dada.orm.first.vo.User;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class ORMTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("zhoudada");
        user.setSex("man");
        user.setAge(18);
        user.setPhone("13166666666");
        BaseService baseService = new BaseServiceImpl();
        int result = baseService.save(user);
        System.out.println(result == 1?"插入数据库成功":"插入数据库失败");
    }
}
