package com.dada.algorithm.sort.first;

import java.util.Arrays;

/**
 * 算法二：选择排序
 * 1：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 2：再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 3：重复第二步，直到所有元素均排序完毕。
 * @author zhoudahua
 * @date 2019/6/22
 * @description
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] array = {23,54,3,23,1,6,7,45,2,5,7,34,64,3};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            if(i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}
