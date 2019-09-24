package com.dada.test.thirdcount;

/**
 * @author zhoudahua
 * @date 2019/6/13
 * @description
 */
public class ThirdCountTest {
    public static void main(String[] args) {
        //== 优先级高于 三目运算符，然后三目运算符从右往左执行！！
        boolean a = true? false : true == true ? false : true;
        System.out.println(a);
    }
}
