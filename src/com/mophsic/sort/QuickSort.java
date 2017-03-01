package com.mophsic.sort;

/**
 * <h2>快速排序</h2>
 * <p>
 *  快速排序是利用分治策略完成排序的一种实现方式，利用分治法可将快速排序的分为三步：<br/>
 *  1. 在数据集之中，选择一个元素作为”基准”（pivot）。<br/>
 *  2. 所有小于”基准”的元素，都移到”基准”的左边；所有大于”基准”的元素，都移到”基准”的右边。
 *  这个操作称为分区 (partition) 操作，分区操作结束后，基准元素所处的位置就是最终排序后它的位置。<br/>
 *  3. 对”基准”左边和右边的两个子集，不断重复第一步和第二步，直到所有子集只剩下一个元素为止。
 *  </p>
 *
 * @author xiaofei
 * @date 2017/3/1
 */
final class QuickSort {
    private QuickSort() {
    }

    /**
     * 寻找枢轴的位置。初始化中枢轴为array[low]，一次循环之后，凡是枢轴之后的元素都比它大，枢轴之前的元素都比它小。
     *
     * @param array     原数组
     * @param low       数组中的低位
     * @param height    数组高位
     * @return          中枢轴位置
     */
    private static int partition(int[] array, int low, int height) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("待排序数组不能为空");
        int pivot = array[low];
        while (low < height) {
            while (low < height && array[height] > pivot) {
                height--;
            }
            array[low] = array[height];

            while (low < height && array[low] < pivot) {
                low++;
            }

            array[height] = array[low];
        }

        array[low] = pivot;
        return low;
    }

    static void quickSort(int[] array, int low, int height) {
        if (low < height) {
            int middle = partition(array, low, height);
            // 低位排序
            quickSort(array, low, middle);
            // 高位排序
            quickSort(array, middle + 1, height);
        }

    }
}
