package com.dsa.assignment;

/**
 * Created by vikas.e.mishra on 8/10/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int low =0;
        int high = array.length;
        int searchFor = 7;
        int output = search(array,low,high,searchFor);
        if(output != -1){
            System.out.println("Element found at position : "+output);
        }else{
            System.out.println("Not found");
        }
    }

    public static int search(int[] arr, int low, int high, int searchElement){

        if(high>=low){
            int mid = low + (high-low)/2;
            if(arr[mid] == searchElement){
                return mid;
            }else if(arr[mid] > searchElement){
                return search(arr,low,mid-1,searchElement);
            } else{
                return search(arr,mid+1,high,searchElement);
            }
        }

        return -1;
    }
}
