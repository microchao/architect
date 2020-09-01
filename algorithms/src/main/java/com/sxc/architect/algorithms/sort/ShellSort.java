package com.sxc.architect.algorithms.sort;

/**
 * 希尔排序
 * 是插入排序的改进，解决插入排序每次只能移动一步的缺点
 * @Date 20200828
 */
public class ShellSort implements Sort{
   public  void sort(int[] array) {
        int n = array.length;
        for (int gap = n/2; gap > 0; gap=gap/2) {
            for(int i = gap;i < n;i++) {
                int key = array[i];
                int j = i;
                while(j>=gap && array[j-gap] > key) {
                    array[j] = array[j-gap];
                    j= j-gap;
                }
                array[j] = key;
            }
        }
    }

    public String getName() {
        return "希尔排序";
    }
}
