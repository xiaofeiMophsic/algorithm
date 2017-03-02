package com.mophsic.sort;

/**
 * 插入排序
 *
 * @author xiaofei
 * @date 2017/3/2
 */
class InsertionSort {

    private InsertionSort(){}

    static void insertSort(int[] array) {
        if (array == null || array.length <= 0)
            throw new IllegalArgumentException("待排序数组不合法");

        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];

            int j ;
            for (j = i; j > 0 && tmp < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }

            array[j] = tmp;
        }
    }
}
