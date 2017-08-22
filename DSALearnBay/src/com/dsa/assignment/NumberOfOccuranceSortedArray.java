package com.dsa.assignment;

/**
 * Created by vikas.e.mishra on 8/10/2017.
 * <p>
 * Count number of occurrences (or frequency) in a sorted array.
 * Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn)
 * http://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
 * <p>
 * <p>
 * 1) Use Binary search to get index of the first occurrence of x in arr[]. Let the index of the first occurrence be i.
 * 2) Use Binary search to get index of the last occurrence of x in arr[]. Let the index of the last occurrence be j.
 * 3) Return (j – i + 1);
 */
public class NumberOfOccuranceSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int itemToSearch = 3;
        System.out.println(count(arr,arr.length,itemToSearch));
    }

    private static int count(int[] arr, int length, int searchItem){

        int i; // first occurrence of searchItem
        int j; // last occurrence of searchItem

        //i = BinarySearch.search(arr,0,length-1,searchItem);
        i = first(arr,0,length-1,searchItem,length);

        j = last(arr,i,length-1,searchItem,length);

        return j-i+1;
    }

    /* if x is present in arr[] then returns the
       index of FIRST occurrence of x in arr[0..n-1],
       otherwise returns -1 */
    static int first(int arr[], int low, int high, int x, int n)
    {
        if(high >= low)
        {
        /*low + (high - low)/2;*/
            int mid = (low + high)/2;
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;
            else if(x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid -1), x, n);
        }
        return -1;
    }

    /* if x is present in arr[] then returns the
       index of LAST occurrence of x in arr[0..n-1],
       otherwise returns -1 */
    static int last(int arr[], int low, int high, int x, int n)
    {
        if(high >= low)
        {
        /*low + (high - low)/2;*/
            int mid = (low + high)/2;
            if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x )
                return mid;
            else if(x < arr[mid])
                return last(arr, low, (mid -1), x, n);
            else
                return last(arr, (mid + 1), high, x, n);
        }
        return -1;
    }
}
