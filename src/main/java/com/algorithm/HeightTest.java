package com.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class HeightTest {

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] strings = sortPeople(names, heights);
        System.out.println(JSON.toJSONString(strings));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            Integer index = indices[i];
            String name = names[index];
            res[i] = name;
        }
        return res;
    }

}
