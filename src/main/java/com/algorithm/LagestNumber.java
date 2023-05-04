package com.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class LagestNumber {

    public static void main(String[] args) {
        int[] a = {3,30,34,5,9};
        String s = largestNumberMethod(a);
        // String s = method(a);
        System.out.println(s);
    }

    public static String largestNumberMethod(int[] nums) {
        if (nums == null ||nums.length == 0) {
            return "";
        }
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s2.compareTo(s1);
            }
        });
        if (str[0].charAt(0) == '0') {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String method (int[] nums) {
        int n = nums.length;
        // 转换成包装类型，以便传入 Comparator 对象（此处为 lambda 表达式）
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }
        System.out.println(numsArr.toString());

        Arrays.sort(numsArr, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            int i = (int) (-sy * x - y + sx * y + x);
            return i;
        });

        if (numsArr[0] == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }
        return ret.toString();
    }

}
