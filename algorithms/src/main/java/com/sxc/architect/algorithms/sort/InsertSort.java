package com.sxc.architect.algorithms.sort;

/**
 * 插入排序
 * @DATE 2020/08/27
 */
public class InsertSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int temp = array[j]; // 拿到当前需要往前插入的
            while(j > 0 && array[j-1] > temp) { // 每次判断都是当前需要插入的，依次判断
                array[j] = array[j-1]; // 比当前需要插入的大的往后挪
                j--;
            }
            array[j] = temp; // 已经空出的位置
        }
    }
}
