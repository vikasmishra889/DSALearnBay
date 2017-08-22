package com.dsa.assignment;

/**
 * Created by vikas.e.mishra on 8/11/2017.
 * <p>
 * Given an array and a number k where k is smaller than size of array,
 * we need to find the k’th smallest element in the given array.
 * It is given that ll array elements are distinct.
 * <p>
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
 * k = 3
 * Output: 7
 * <p>
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
 * k = 4
 * Output: 10
 *
 *  sort the given array using a O(nlogn) sorting algorithm like Merge Sort, QuickSort
 *  Heap Sort, etc and return the element at index k-1 in the sorted array.
 *  Time Complexity of this solution is O(nLogn).
 *
 *  How to do using Binary Min Heap
 */
public class SelectKthSmallestElement {

    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15};
        int k = 2;
        printArray(array);
        QuickSort.quickSort(array,0,array.length-1);
        printArray(array);

        System.out.println(k+" th smallest item in list is "+array[k-1]);

    }

    private static void printArray(int[] array){
        int i =0;
        while(i<array.length){
            System.out.print(" "+array[i]);
            ++i;
        }
        System.out.println("");
    }
}
