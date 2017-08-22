package com.dsa.assignment;

/**
 * Created by vikas.e.mishra on 8/11/2017.
 * Find common elements in three sorted arrays.
 * <p>
 * Example
 * ar1[] = {1, 5, 5}
 * ar2[] = {3, 4, 5, 5, 10}
 * ar3[] = {5, 5, 10, 20}
 * Output: 5, 5
 * <p>
 * ar1[] = {1, 5, 10, 20, 40, 80}
 * ar2[] = {6, 7, 20, 80, 100}
 * ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
 * Output: 20, 80
 */
public class CommonElementIn3SortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else{
                k++;
            }
        }

    }

}
