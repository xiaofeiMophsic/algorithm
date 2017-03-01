package com.mophsic.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author xiaofei
 * @date 2017/3/1
 */

class SelectionSortTest {

    @Test
    void sort() {
        final int[] array = {8, 2, 3, 4, 1, 0};

        SelectionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}