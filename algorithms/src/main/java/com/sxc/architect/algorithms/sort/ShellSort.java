package com.sxc.architect.algorithms.sort;

/**
 * 希尔排序
 * @Date 20200828
 */
public class ShellSort implements Sort{
    public  void sort(int[] array) {
        int gap = array.length/2-1;
        for(int i = gap; gap >0;  gap = gap/2) { //这一层算gap
            for(int j = 0; j< array.length; j = j+gap) {
                int temp = j + gap;
                while(array[temp] > array[j - gap]) {

                }
                /*if(array[j] > array[bigGap] ) {
                    int temp = array[bigGap];
                    array[bigGap] = array[j];
                    array[j] = temp;
                }*/
            }
        }
    }

    public String getName() {
        return "希尔排序";
    }
}
