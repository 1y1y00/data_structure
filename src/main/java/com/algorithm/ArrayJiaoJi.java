package com.algorithm;


import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组交集
 */
public class ArrayJiaoJi {

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            intersect(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i:nums1) {
            int count = map.getOrDefault(i,0)+1;
            map.put(i,count);
        }
        int[] shuZu = new int[nums1.length];
        int index = 0;
        for(int i: nums2) {
            int count = map.getOrDefault(i,0);
            if (count > 0) {
                System.out.println(index);
                shuZu[index++] = i;
                System.out.println(index);
//                index++;
                count--;
                if (count > 0) {
                    map.put(i,count);
                } else {
                    map.remove(i);
                }
            }
        }
//        int[] ints = Arrays.copyOfRange(shuZu, 0, index);
//        Arrays.sort(ints);
        return Arrays.copyOfRange(shuZu, 0, index);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5,4,4};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] intersect = intersect(nums1, nums2);
        System.out.println(JSON.toJSONString(intersect));
    }


}
