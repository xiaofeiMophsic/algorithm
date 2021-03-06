package com.mophsic.sort;

/**
 * 选择排序<br/>
 *  <p>
 *      首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 *      然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *      以此类推，直到所有元素均排序完毕。
 *  </p>
 * @author xiaofei
 * @date 2017/3/1
 */
final class SelectionSort {

    private SelectionSort(){}

    static void sort(int[] array){
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Illegal array!");

        final int N = array.length;
        for (int i = 0; i < N; i++) {
            int k = i;
            for (int j = i + 1; j < N; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }

            int tmp = array[i];
            array[i] = array[k];
            array[k] = tmp;
        }
    }
}
