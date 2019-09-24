package com.dada.test.string;

/**
 * @author zhoudahua
 * @date 2019/6/7
 * @description
 */
public class Test {
    public static void main(String[] args) {
        String s = "abcdefg";
        //codePointAt返回指定索引位置的字符的ASCII/Unicode 编码
        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointCount(0, 2));
    }
}
