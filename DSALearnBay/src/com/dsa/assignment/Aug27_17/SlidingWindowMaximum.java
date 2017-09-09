package com.dsa.assignment.Aug27_17;

/**
 * Created by vikas.e.mishra on 9/2/2017.
 * <p>
 * Sliding Window Maximum (Maximum of all subarrays of size k)
 * Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
 * <p>
 * Examples:
 * <p>
 * Input :
 * arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}
 * k = 3
 * Output :
 * 3 3 4 5 5 5 6
 * <p>
 * Input :
 * arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}
 * k = 4
 * Output :
 * 10 10 10 15 15 90 90
 * <p>
 * http://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
 * <p>
 * Method 1 (Simple)
 * Run two loops. In the outer loop, take all subarrays of size k.
 * In the inner loop, get the maximum of the current subarray.
 * Time Complexity: The outer loop runs n-k+1 times and the inner loop runs k times
 * for every iteration of outer loop. So time complexity is O((n-k+1)*k) which can also be written as O(nk).
 */
public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        printKMax(arr, arr.length, k);
    }

    private static void printKMax(int[] arr, int n, int k) {

        for (int i = 0; i < n-k; i++) {
            int max = arr[i];
            for (int j = 0; j <= k; j++) {
                if (arr[i+j]>max) {
                    max = arr[i+j];
                }
            }
            System.out.print(" "+max);
        }
    }
}
