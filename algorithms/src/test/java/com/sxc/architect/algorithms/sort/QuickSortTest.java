package com.sxc.architect.algorithms.sort;


import org.junit.Test;

public class QuickSortTest extends BaseTest {

    @Test
    public void qcTest() {
        Sort sort = new QuickSort();
        int[] array = new int[]{3,7,1,9,6,5,2};
        sort.sort(array);
        for (int i : array) {
            System.out.print(i+",");
        }
    }
}