package com.sxc.architect.datastruct.linearlist;

/**
 * 将顺序表L的所有元素逆置，要求算法的空间复杂度为O(1)
 */
public class LinearList {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i = 1; i <= array.length/2; i++) {
            int temp = array[array.length-i];
            array[array.length-i] = array[i-1];
            array[i-1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
