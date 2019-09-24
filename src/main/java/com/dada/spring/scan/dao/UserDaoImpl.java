package com.dada.spring.scan.dao;

import com.dada.spring.scan.annotation.MyScan;
import org.springframework.stereotype.Service;

/**
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
@MyScan("AA")
@Service("userDao")
public class UserDaoImpl implements UserDao {
    public void query(){
        System.out.println(111);
    }
}
