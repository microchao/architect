package com.sxc.architect.algorithms.sort;

/**
 * 快速排序
 * 20201028
 */
public class QuickSort implements Sort{
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }

    private void quickSort(int[] array, int low, int high) {
        if(low < high) {
            int pivotpos = partition(array, low, high);
            quickSort(array,low,pivotpos-1);
            quickSort(array,pivotpos+1,high);
        }
    }

    public String getName() {
        return "快速排序";
    }

    private int partition(int[] a,int low,int high) {
        int pivot = a[low];
        while(low < high) {
            while(low < high && a[high] >= pivot) {
                /**一直往左移动直到找到比pivot小的元素*/
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] <= pivot) {
                /**一直往右移动直到找到比pivot小的元素*/
                low ++;
            }
            a[high] = a[low];
        }
        a[low] = pivot;
        return low;
    }
}
