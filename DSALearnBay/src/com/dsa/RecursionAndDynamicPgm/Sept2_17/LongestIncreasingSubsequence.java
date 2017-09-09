package com.dsa.RecursionAndDynamicPgm.Sept2_17;

/**
 * Created by vikas.e.mishra on 9/2/2017.
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int arr[] = {3,10,2,1,20};
        int n = arr.length;
        System.out.println("Length of longest sub sequence is " + longestSubSeq(arr, n));
    }

    private static int longestSubSeq(int[] arr, int n) {
        int[] temp = new int[n];
        int i, j, max = 0;
        for (i = 0; i < n; i++) {
            temp[i] = 1;
        }

        /* Compute optimized LIS values in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j])
                    temp[i] = temp[j] + 1;

           /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < temp[i])
                max = temp[i];

        return max;
    }
}
