package com.mophsic.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 7, 8, 5, 6};
        QuickSort.quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}
