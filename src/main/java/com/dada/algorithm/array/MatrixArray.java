package com.dada.algorithm.array;

/**
 * 二维数组的查找
 * @author zhoudahua
 * @date 2019/6/25
 * @description
 */
public class MatrixArray {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{5,7,9},{12,67,94},{232,565,865}};
        System.out.println(find(68,array));
    }

    public static boolean find(int target,int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length,cols = matrix[0].length;

        int r = 0,c = cols - 1;
        while (r <= rows -1 && c >= 0){
            if(target == matrix[r][c]) {
                return true;
            }else if(target > matrix[r][c]) {
                r ++;
            }else {
                c --;
            }
        }
        return false;
    }
}
