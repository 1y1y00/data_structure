package com.algorithm;


/**
 * 买卖股票最佳时间
 */
public class GuPiao {

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int i = maxProfit(a);
        System.out.println(i);
    }

}
