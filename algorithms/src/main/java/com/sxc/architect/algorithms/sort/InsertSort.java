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
             * 关键点：
             * 1.每次都是跟key比较比key大的往后挪
             * 2.while循环只比较前面的大小，因为前面的已经排过序了，不用顾及再前面的
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
