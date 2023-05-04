package com.algorithm;

/**
 * 选择排序
 */
public class SelectionCode {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 数组长度
        int num = arr.length;
        for (int i = 0; i < num; i++) {
            // 最小值变量的角标
            int minValueIndex = i;
            for (int j = i + 1; j < num; j++) {
//                获取最小值下标
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr,i,minValueIndex);

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
        int arr[] = {3,2,35,325,6,42,5,6,9,0,4};
        selectSort(arr);
        for (int i = 0 ;i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
