package com.sxc.architect.algorithms.sort;


import org.junit.Test;

public class BubbleSortTest extends BaseTest {
    @Test
    public void sort() {
        int[] array = generateArray();
        int[] sortArray = copyArray(array);
        long startTime = System.currentTimeMillis();
        BubbleSort.sort(sortArray);
        long endTime = System.currentTimeMillis();
        System.out.println("BubbleSort time:" + (endTime - startTime) + "/ms, array size:" + array.length);
        super.verifyOrder(array,sortArray);
    }
}
