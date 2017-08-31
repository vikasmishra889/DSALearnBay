package com.dsa.SortingSearching.Aug26_17;

/**
 * Created by vikas.e.mishra on 8/26/2017.
 *
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in wrong order.
 *
 * http://www.geeksforgeeks.org/bubble-sort/
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.sort();
    }

    public void sort() {
        int arr[] = {5, 4, 3, 2, 1};
        int temp;
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { // understand this condition
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
