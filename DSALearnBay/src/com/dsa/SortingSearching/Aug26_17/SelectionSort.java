package com.dsa.SortingSearching.Aug26_17;

/**
 * Created by vikas.e.mishra on 8/26/2017.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println("Before");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        int i, j, min_idx;
        for (i = 0; i < arr.length - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < arr.length; j++) {
                min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
