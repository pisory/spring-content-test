package com.dada.algorithm.sort.first;

import java.util.Arrays;

/**
 * 算法一：冒泡排序
 * 1：比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2：对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 3：针对所有的元素重复以上的步骤，除了最后一个。
 * 4：持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @author zhoudahua
 * @date 2019/6/22
 * @description
 */
public class BubbleSort{
    public static void main(String[] args) {
        int [] array = {23,54,3,23,1,6,7,45,2,5,7,34,64,3};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] arr){
        int[] array = Arrays.copyOf(arr, arr.length);
        for(int i = 0;i < array.length - 1;i ++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
