package com.dada.construction;

/**
 * @author zhoudahua
 * @date 2019/6/19
 * @description
 */
public class B extends A {
    String id = "0000";
    public B(String id) {
        //注意：super(id)必须要显示地调用出来，否则编译报错！！！
        super(id);
        this.id = id;
    }
}
