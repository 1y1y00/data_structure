package com.algorithm;

/**
 * 冒泡排序
 */
public class BubblingCode {

    /**
     * 前一位和后以为交换，较大的放在后面，知道换到最后一位，肯定是最大的值放在最后一位
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
//        0 ~ n
//        0 ~ n-1
        int n = arr.length;
        for (int end = n-1; end >= 0; end--) {
//            在0~end上干一些事情，0跟1要不要换，1跟2之间要不要换，2跟3之间要不要换 。。。end-1跟end之间要不要换
            for (int second = 1; second <= end ; second++) {
                if (arr[second -1] > arr[second]) {
                    swap(arr,second-1,second);
                }
            }

        }
    }


    /**
     * 交换，将最小值交换到下标较小的那个位置上去
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
//        int arr[] = {3,2,35,325,6,42,5,6,9,0,4};
//        bubbleSort(arr);
//        for (int i = 0 ;i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }

        char cur = 'a';
        System.out.println(++cur);
//        System.out.println(cur++);
    }

}
