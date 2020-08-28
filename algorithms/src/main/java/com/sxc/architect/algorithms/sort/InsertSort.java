package com.sxc.architect.algorithms.sort;

/**
 * 插入排序
 * @DATE 2020/08/27
 */
public class InsertSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[0];
            if(array[i] < temp) {
                if(array[i] < temp) {
                    temp = array[i];
                }
            }
        }
    }
}
