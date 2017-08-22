package com.dsa.assignment;

/**
 * Created by vikas.e.mishra on 8/10/2017.
 * <p>
 * Rearrange positive and negative numbers in O(n) time and O(1) space.
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that positive and negative numbers are
 * placed alternatively.
 * For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]
 * <p>
 * http://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/
 */
public class RearrangePositiveNegativeNumber {

    public static void main(String[] args) {

        int[] inputArr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        printArray(inputArr);

        int temp, j = 0;
        // The following few lines are similar to partition
        // process of QuickSort.  The idea is to consider 0
        // as pivot and divide the array around it.
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < 0) {
                temp = inputArr[j];
                inputArr[j] = inputArr[i];
                inputArr[i] = temp;
                j++;
            }
        }
        // Now all positive numbers are at end and negative numbers at
        // the beginning of array. Initialize indexes for starting point
        // of positive and negative numbers to be swapped
        printArray(inputArr);

        int positive = j;
        int negative = 0;
        // Increment the negative index by 2 and positive index by 1, i.e.,
        // swap every alternate negative number with next positive number
        while (positive < inputArr.length && negative < positive) {
            temp = inputArr[negative];
            inputArr[negative] = inputArr[positive];
            inputArr[positive] = temp;
            positive++;
            negative = negative + 2;
        }
        printArray(inputArr);

    }

    private static void printArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(" " + arr[k]);
        }
        System.out.println();
    }
}
