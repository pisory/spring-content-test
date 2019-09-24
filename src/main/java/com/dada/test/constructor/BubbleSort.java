package com.dada.test.constructor;

import java.util.Arrays;

/**
 * @author zhoudahua
 * @date 2019/6/15
 * @description
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,7,24,74,3,2,4,8,12};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
