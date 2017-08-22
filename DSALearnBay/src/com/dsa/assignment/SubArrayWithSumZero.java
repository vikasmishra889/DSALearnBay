package com.dsa.assignment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vikas.e.mishra on 8/11/2017.
 * <p>
 * Input: {4, 2, -3, 1, 6}
 * Output: true
 * There is a subarray with zero sum from index 1 to 3.
 * <p>
 * Input: {4, 2, 0, 1, 6}
 * Output: true
 * There is a subarray with zero sum from index 2 to 2.
 * <p>
 * Input: {-3, 2, 3, 1, 6}
 * Output: false
 * There is no subarray with zero sum.
 *
 * http://www.geeksforgeeks.org/find-if-there-is-a-subarray-with-0-sum/
 */
public class SubArrayWithSumZero {

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        boolean res = findSubarray(arr);
        if (res) {
            System.out.println("There is a sub-array with sum 0");
        } else {
            System.out.println("NO sub-array with sum 0");
        }
    }

    private static boolean findSubarray(int[] arr) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int sum = 0;
        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (sum == 0 || arr[i] == 0 || null != hashMap.get(sum)) {
                return true;
            }

            // Add sum to hash map
            hashMap.put(sum, i);
        }
        return false;
    }

}
