package com.sxc.architect.algorithms.sort;


import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class BubbleSortTest {

    public int[] generateArray() {
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    @Test
    public void sort() {
        int[] array = generateArray();
        long startTime = System.currentTimeMillis();
        BubbleSort.sort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("BubbleSort time:" + (endTime - startTime) + "/ms, array size:" + array.length);
        for (int i = 0; i < array.length-1; i++) {
            Assert.assertEquals(array[i] <= array[i+1],true);
        }
    }
}
