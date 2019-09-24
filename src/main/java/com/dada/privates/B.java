package com.dada.privates;

/**
 * @author zhoudahua
 * @date 2019/6/19
 * @description
 */
public class B extends A {

    public static void main(String[] args) {
        A a = new A(2);
        //编译报错，num是A的是有属性，不能.出来
        //System.out.println(a.num);
    }

    public B(int a) {
        super(a);
    }
}
