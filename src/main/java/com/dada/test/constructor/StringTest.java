package com.dada.test.constructor;

/**
 * @author zhoudahua
 * @date 2019/6/15
 * @description
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "NICE_CAMEL";
        String b = "A_Good_IDEA";
        String c = "FaceBook";
        a = toTuoFeng(a);
        b = toTuoFeng(b);
        c = toTuoFeng(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static String toTuoFeng(String item) {
        item = item.toLowerCase();
        String[] letters = item.split("_");
        String newItem = letters[0];
        for(int i = 1;i < letters.length; i ++){
            newItem = newItem + letters[i].substring(0,1).toUpperCase() + letters[i].substring(1);
        }
        return newItem;
    }
}
