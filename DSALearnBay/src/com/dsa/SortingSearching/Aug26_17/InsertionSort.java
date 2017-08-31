package com.dsa.SortingSearching.Aug26_17;

/**
 * Created by vikas.e.mishra on 8/26/2017.
 * <p>
 * Algorithm
 * // Sort an arr[] of size n
 * insertionSort(arr, n)
 * Loop from i = 1 to n-1.
 * ……a) Pick element arr[i] and insert it into sorted sequence arr[0…i-1]
 */
public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 1};


        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
