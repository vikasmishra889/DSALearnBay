package com.dsa.stacksAndQueues.Aug19_17;

/**
 * Created by vikas.e.mishra on 8/20/2017.
 */
public class Test {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int min = 0;
        int max = arr.length - 1;
        int itemToSearch = 88;
        int index = binarySearch(arr, min, max, itemToSearch);
        if (index == -1) {
            System.out.println("Do not find element");
        } else {
            System.out.println(itemToSearch + " found at index " + index);
        }
    }

    private static int binarySearch(int[] arr, int minIndex, int maxIndex, int itemToFind) {

        while (minIndex <= maxIndex) {
            int midIndex = (minIndex + maxIndex) / 2;
            if (arr[midIndex] == itemToFind) {
                return midIndex;
            } else if (arr[midIndex] > itemToFind) {
                maxIndex = midIndex - 1;
            } else {
                minIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
