package com.algorithm;

public class LargestAltitude {

    public static int LargestAltitudeMethod(int[] gain) {
        int ans = 0;
        int sum = 0;
        for (int i : gain) {
            sum += i;
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {-5, 1, 5, 0, -7};
        int i = LargestAltitudeMethod(a);
        System.out.println(i);
    }

}
