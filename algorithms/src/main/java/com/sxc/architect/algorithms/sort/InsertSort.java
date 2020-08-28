package com.sxc.architect.algorithms.sort;

/**
 * 插入排序
 * @DATE 2020/08/27
 */
public class InsertSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int temp = array[j];
            while(j > 0 && array[j-1] > temp) {
                array[j] = array[j-1];
                j--;
            }
            if(j != i) {
                array[j] = temp;
            }
        }
    }
}
