package com.dada.test.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3","4","5");

        /*List<String> result= new ArrayList<>(list);*/

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("4".equals(s)) {
                iterator.remove();
            }
        }

        System.out.println("list:" + list);
    }

    public void run() {

    }
}
