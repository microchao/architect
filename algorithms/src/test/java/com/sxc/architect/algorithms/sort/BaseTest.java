package com.sxc.architect.algorithms.sort;

import org.junit.Assert;

import java.util.Random;

public class BaseTest {

    final int ARRAY_LENGTH = 10;

    protected int[] generateArray() {
        int[] array = new int[ARRAY_LENGTH];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    protected void verifyOrder(int[] array,int[] sortArray) {
        for (int i = 0; i < array.length; i++) {
            boolean result = false;
            int temp = array[i];
            for (int j = 0; j < sortArray.length; j++) {
                if(sortArray[j] == temp){
                    result = true;
                    break;
                }
            }
            Assert.assertEquals(result,true);
        }
    }

    protected int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
