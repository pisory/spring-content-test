package com.dada.zalgorithm.sort.second;

/**
 * @author zhoudahua
 * @date 2019/6/24
 * @description
 */
public class Merge {
    /* public static void main(String[] args) {
        int [] array = {23,54,3,238,1,6,7,45,2,5,7,34,64,3};
        System.out.println(Arrays.toString(sort(array)));
    }

   public static int[] sort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);

        if(array.length < 2) {
            return array;
        }

        int middle = (int) Math.floor(array.length / 2);
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        return merge(sort(left), sort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while(left.length > 0 && right.length > 0) {
            if(left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            }else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while(left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }*/
}
