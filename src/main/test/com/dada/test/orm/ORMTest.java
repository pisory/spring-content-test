package com.dada.test.orm;

import com.dada.orm.first.service.BaseService;
import com.dada.orm.first.service.impl.BaseServiceImpl;
import com.dada.orm.first.vo.User;
import org.junit.Test;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
public class ORMTest {
    @Test
    public void Test() {
        User user = new User();
        user.setName("zhoudada");
        user.setSex("man");
        user.setAge(18);
        user.setPhone("13166666666");
        BaseService baseService = new BaseServiceImpl();
        int result = baseService.save(user);
        System.out.println(result);
    }
}
