package com.mophsic.sort;

import java.util.Arrays;

/**
 * @author xiaofei
 * @date 2017/3/20
 */
public class SequenceNum {

    static int seq(int[] num) {
        if (num == null || num.length == 0) {
            throw new IllegalArgumentException("null array");
        }

        Arrays.sort(num);
        StringBuilder sb = new StringBuilder();
        int before = num[0];
        for (int i = 0; i <= num.length - 1; i++) {
            if (i > 0 && num[i] != before + 1) {
                sb.append("-");
            }
            sb.append("+");
            before = num[i];
        }
        System.out.println(sb.toString());
        System.out.println(Arrays.toString(num));
        String[] strs = sb.toString().split("-");
        int maxLength = strs[0].length();
        for (int i = 1; i <= strs.length - 1; i++) {
            if (maxLength < strs[i].length()) {
                maxLength = strs[i].length();
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4};
        int le = seq(num);
        System.out.println(le);
    }
}
