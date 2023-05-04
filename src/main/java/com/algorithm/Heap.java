package com.algorithm;

/**
 * 堆
 */
public class Heap {

    private int[] heap;
    private final int limit;
    private int heapSize;

    public Heap(int limit) {
        heap = new int[limit];
        this.limit = limit;
        heapSize = 0;
    }

    public static void main(String[] args) {
        Heap heap1 = new Heap(5);
        heap1.push(2);
        heap1.push(5);
        heap1.push(6);
        heap1.push(0);
        heap1.push(9);

        int pop = heap1.pop();
        System.out.println(pop);

    }


    private int pop () {
        int ans = heap[0];
        swap(heap,0,--heapSize);
        heapify(heap,0,heapSize);
        return ans;
    }

    private void push(int num) {
        if (heapSize == limit) {
            throw new RuntimeException("heap is full");
        }
        heap[heapSize] = num;
        heapInsert(heap,heapSize++);
    }

    private void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    // 从index位置，往下看，不断的下沉
    // 停：较大的孩子都不再比index位置的数大；已经没孩子了
    private void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) { // 如果有左孩子，有没有右孩子，可能有可能没有！
            // 把较大孩子的下标，给largest
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            // 较大孩子和父节点进行比较
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            // index和较大孩子的值进行互换
            swap(arr, largest, index);
            // index的位置要继续向下面沉，作为父节点，之后找到自己得左节点的孩子，之后周而复始
            index = largest;
            left = index * 2 + 1;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
