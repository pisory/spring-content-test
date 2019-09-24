package com.dada.test.firstinterview.statics;

/**
 * @author zhoudahua
 * @date 2019/6/15
 * @description
 */
public class Test {
    public int a = 1;
    public static int b = 1;
    public static void main(String[] args) {
        Test test = new Test();
        Test test1 = new Test();
        test.a = test.a + 1;
        System.out.println(test.a);
        System.out.println(test1.a);
    }
}
