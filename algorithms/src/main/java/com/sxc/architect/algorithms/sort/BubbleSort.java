package com.sxc.architect.algorithms.sort;

/**
 * 冒泡排序
 * @Date 2020/08/27
 */
public class BubbleSort implements Sort{
    public  void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int temp = array[i];
                if(array[j] > array[i]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public String getName() {
        return "冒泡排序";
    }
}
