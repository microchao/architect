package com.sxc.architect.algorithms.sort;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Random;

public class BaseTest {

    protected int ARRAY_LENGTH = 10;

    protected int[] generateArray() {
        int[] array = new int[ARRAY_LENGTH];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    protected void verifyOrder(int[] array,int[] sortArray) {
        int[] copyArray = copyArray(array);
        Arrays.sort(copyArray);
        Assert.assertEquals(copyArray.length, sortArray.length);
        for (int i = 0; i < copyArray.length; i++) {
            Assert.assertEquals(copyArray[i] ,sortArray[i]);
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
