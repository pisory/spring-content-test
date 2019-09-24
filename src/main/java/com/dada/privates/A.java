package com.dada.privates;

/**
 * @author zhoudahua
 * @date 2019/6/19
 * @description
 */
public class A {
    private int num ;
    public A(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        A a = new A(2);
        System.out.println(a.num);
    }
}
