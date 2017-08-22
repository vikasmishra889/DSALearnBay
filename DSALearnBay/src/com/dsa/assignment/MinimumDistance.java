package com.dsa.assignment;

/**
 * Created by vikas.e.mishra on 8/10/2017.
 * <p>
 * <p>
 * Find the minimum distance between two numbers
 * <p>
 * Input: arr[] = {2, 5, 3, 5, 4, 4, 2, 3}, x = 3, y = 2
 * Output: Minimum distance between 3 and 2 is 1.
 * <p>
 * Input: int arr[] ={3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3}  x=3 , y=6
 * Output: Minimum distance between 3 and 6 is 1.
 */
public class MinimumDistance {

    public static void main(String[] args) {

        int[] inputArry = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
        int x = 3;
        int y = 6;
        int i;
        int firstOccurance = 0;
        int minDistance = Integer.MAX_VALUE;
        int n = inputArry.length;

        // Find the first occurence of any of the two numbers (x or y)
        // and store the index of this occurence in firstOccurance
        for (i = 0; i < n; i++) {
            if (x == inputArry[i] || y == inputArry[i]) {
                firstOccurance = i;
                break;
            }

        }
        // Traverse after the first occurrence
        for (; i < n; i++) {
            if (x == inputArry[i] || y == inputArry[i]) {
                // If the current element matches with any of the two then
                // check if current element and prev element are different
                // Also check if this value is smaller than minimum distance
                // so far
                if (inputArry[firstOccurance] != inputArry[i] && (minDistance>(i-firstOccurance))) {
                    minDistance = i - firstOccurance;
                    firstOccurance = i;
                }else{
                    firstOccurance = i;
                }
            }
        }
        System.out.println("Minimum distance is "+minDistance);


    }
}
