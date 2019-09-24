package com.dada.list;

import java.util.*;
import java.util.stream.Stream;

/**
 * 面试题：list去重并且重新排序
 * @author zhoudahua
 * @date 2019/6/20
 * @description
 */
public class SortAndSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(45);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(2);
        System.out.println(list);
        //步骤一：去重复
        LinkedHashSet set = new LinkedHashSet(list);
        System.out.println(set);
        list = new ArrayList<>(set);
        System.out.println(list);

        //步骤二：

        //第一种，使用Collections的逆序方法
        /*Collections.sort(list, Collections.<Integer>reverseOrder());*/

        //第二种，使用comparator
        /*Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2? 1 : -1;
            }
        });*/

        //第三种，使用jdk1.8的stream流
        /*Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });*/

    }
}
