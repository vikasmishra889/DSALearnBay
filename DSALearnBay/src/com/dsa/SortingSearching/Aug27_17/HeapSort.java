package com.dsa.SortingSearching.Aug27_17;

/**
 * Created by vikas.e.mishra on 8/27/2017.
 *
 * complexity - nlon(n)
 * http://www.geeksforgeeks.org/heap-sort/
 */
public class HeapSort {
    public static void main(String[] args) {

        int arr[] = {10, 3, 4, 1, 2};
        HeapSort hs = new HeapSort();
        System.out.println("Before Sort");
        hs.print(arr);
        hs.sort(arr);
        System.out.println("After Sort");
        hs.print(arr);
    }

    public void sort(int arr[]) {
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(arr, len, i);
        }
        for (int i = len - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public void heapify(int arr[], int len, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        if (leftChild < len && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (rightChild < len && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, len, largest);
        }
    }

    public void print(int[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
