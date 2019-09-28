package com.dada.zalgorithm.sort.first;

import java.util.Arrays;

/**
 * 快速排序(这个实现更容易理解)
 * 1:选取一个基元X（一般选取数组第一个/最后一个元素），通过某种分区操作（partitioning）将数组划分为两个部分：左半部分小于等于X，右半部分大于等于X。
 * 2:左右两个子数组递归地调用Divide过程
 * 3:快排作为就地排序算法（in place sort），不需要任何合并操作
 * @author zhoudahua
 * @date 2019/6/24
 * @description
 */
public class QuickSort {

    public static void main(String[] args)
    {
        int [] array = {23,54,3,238,1,6,7,45,2,5,7,34,64,3};
        QuickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void QuickSort(int[] array,int start,int end)
    {
        if(start<end)
        {
            int key=array[start];//初始化保存基元
            int i=start,j;//初始化i,j
            for(j=start+1;j<=end;j++)
            {
                if(array[j]<key)//如果此处元素小于基元，则把此元素和i+1处元素交换，并将i加1，如大于或等于基元则继续循环
                {
                    int temp=array[j];
                    array[j]=array[i+1];
                    array[i+1]=temp;
                    i++;
                }

            }
            array[start]=array[i];//交换i处元素和基元
            array[i]=key;
            QuickSort(array, start, i-1);//递归调用
            QuickSort(array, i+1, end);

        }

    }

}
