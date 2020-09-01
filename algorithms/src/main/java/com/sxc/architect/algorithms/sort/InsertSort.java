package com.sxc.architect.algorithms.sort;

/**
 * 插入排序
 * @DATE 2020/08/27
 */
public class InsertSort implements Sort{
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int key = array[i];
            /**
             * 关键点在于每次都是跟key比较
             * 比key大的往后挪
             */
            while(j>0 && array[j-1] > key) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = key;
        }
    }

    public String getName() {
        return "插入排序";
    }
}
