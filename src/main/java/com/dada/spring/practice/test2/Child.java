package com.dada.spring.practice.test2;

public class Child extends Base{
    void test() {
        System.out.println(" Child.test()");
    }

    public static void test2() {
        System.out.println("a");
    }

    static public void main(String[] a) {
        Child child = new Child();
        Base base = (Base) child;
        base.test();
    }
}
