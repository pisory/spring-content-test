package com.dada.test.firstinterview.supers;

/**
 * @author zhoudahua
 * @date 2019/6/15
 * @description
 */
public class B extends A {
    //重写
    public int method(int a,int b) {
        return  0;
    }

    //跟父类没有关系，如果子类有同名方法，则和子类是重载
    private int method(int a,long b) {
        return  0;
    }
}
