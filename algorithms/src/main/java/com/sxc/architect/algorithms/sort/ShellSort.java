package com.sxc.architect.algorithms.sort;

/**
 * 希尔排序
 * @Date 20200828
 */
public class ShellSort implements Sort{

    public  void sort(int[] array) {
        int gap = array.length/2-1;
        for(int i = gap; gap >0;  gap = gap/2) { //这一层算出gap
            for(int j = 0; j< array.length; j = j+gap) { // 找出所有gap的数字
                int key = array[j];
                int k = j;
                while(k>0 && array[k-gap] > key) {
                    array[k] = array[k-gap];
                    k=k-gap;
                }
                array[k]=key;
            }
        }
    }

//    public void sort(int arrayToSort[]) {
//        int n = arrayToSort.length;
//
//        for (int gap = n / 2; gap > 0; gap /= 2) {
//            for (int i = gap; i < n; i++) {
//                int key = arrayToSort[i];
//                int j = i;
//                while (j >= gap && arrayToSort[j - gap] > key) {
//                    arrayToSort[j] = arrayToSort[j - gap];
//                    j -= gap;
//                }
//                arrayToSort[j] = key;
//            }
//        }
//    }

    public String getName() {
        return "希尔排序";
    }
}
