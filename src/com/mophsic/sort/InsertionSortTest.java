package com.mophsic.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaofei
 * @date 2017/3/2
 */
class InsertionSortTest {
    @Test
    void insertSort() {
        int[] array = new int[]{4, 2, 5, 9, 4, 1};

        InsertionSort.insertSort(array);

        System.out.println(Arrays.toString(array));
    }

}