package com.sxc.architect.algorithms.sort;

/**
 * 插入排序
 * @DATE 2020/08/27
 */
public class InsertSort implements Sort{
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int key = array[j]; // 拿到当前需要往前插入的
            while(j > 0 && array[j-1] > key) { // 关键点：每次比较都是要和key比较，比key大的往后挪动
                array[j] = array[j-1]; // 比当前需要插入的大的往后挪
                j--;
            }
            array[j] = key; // 已经空出的位置
        }
    }

    public String getName() {
        return "插入排序";
    }
}
