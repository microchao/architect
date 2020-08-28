package com.sxc.architect.algorithms.sort;

import org.junit.Test;

public class InsertSortTest extends BaseTest{
    @Test
    public void sort() {
        int[] array = generateArray();
        int[] sortArray = copyArray(array);
        long startTime = System.currentTimeMillis();
        InsertSort.sort(sortArray);
        long endTime = System.currentTimeMillis();
        System.out.println("InsertSortTest time:" + (endTime - startTime) + "/ms, array size:" + array.length);
        super.verifyOrder(array,sortArray);
    }
}
