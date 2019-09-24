package com.dada.test.firstinterview.phone;

import java.util.regex.Pattern;

/**
 * @author zhoudahua
 * @date 2019/6/15
 * @description
 */
public class InterViewer {
    public static void main(String[] args) {
        //使用正则表达式判断是否是手机号
        String phone = "13848968372";
        String regex = "^1[\\d]{10}$";
        System.out.println(Pattern.matches(regex, phone));
    }
}
