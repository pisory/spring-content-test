package com.dada.orm.sixth.test;

import com.dada.orm.sixth.bean.User;
import com.dada.orm.sixth.session.Session;
import com.dada.orm.sixth.session.impl.SessionImpl;

/**
 * @author zhoudahua
 * @date 2019/5/29
 * @description
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setName("lll");
        user.setSex("woman");
        Session session = new SessionImpl();
        int result = session.save(user);
        System.out.println(result == 1?"保存成功":"保存失败");
    }
}
