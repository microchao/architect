package com.sxc.architect.algorithms.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortTest extends BaseTest{

    private List<Sort> sortList;

    @Before
    public void before() {
        sortList = new ArrayList<Sort>();
//        sortList.add(new BubbleSort());
//        sortList.add(new InsertSort());
        sortList.add(new ShellSort());
    }

    @Test
    public void sort() {
        super.ARRAY_LENGTH = 10;
        int[] array = super.generateArray();
        for (Sort sort : sortList) {
            int[] sortArray = super.copyArray(array);
            long start = System.currentTimeMillis();
            sort.sort(sortArray);
            long end = System.currentTimeMillis();
            verifyOrder(array,sortArray);
            System.out.println(sort.getName() + " 花费时间: " + (end-start) + "/ms");
        }
    }

}
