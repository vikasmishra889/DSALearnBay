package com.dsa.assignment.Aug27_17;

/**
 * Created by vikas.e.mishra on 9/2/2017.
 * <p>
 * <p>
 * 1) Calculate the medians m1 and m2 of the input arrays ar1[]
 * and ar2[] respectively.
 * 2) If m1 and m2 both are equal then we are done.
 * return m1 (or m2)
 * 3) If m1 is greater than m2, then median is present in one
 * of the below two subarrays.
 * a)  From first element of ar1 to m1 (ar1[0...|_n/2_|])
 * b)  From m2 to last element of ar2  (ar2[|_n/2_|...n-1])
 * 4) If m2 is greater than m1, then median is present in one
 * of the below two subarrays.
 * a)  From m1 to last element of ar1  (ar1[|_n/2_|...n-1])
 * b)  From first element of ar2 to m2 (ar2[0...|_n/2_|])
 * 5) Repeat the above process until size of both the subarrays
 * becomes 2.
 * 6) If size of the two arrays is 2 then use below formula to get
 * the median.
 * Median = (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1]))/2
 * <p>
 * Example
 * ar1[] = {1, 12, 15, 26, 38}; median is 15 m1
 * ar2[] = {2, 13, 17, 30, 45}; median is 17 m2
 * m1 < m2 so sub arrays are
 * [15, 26, 38] and [2, 13, 17] now m1 = 26 and m2 = 13
 * m1 > m2 so sub arrays are
 * [15, 26] and [13, 17]
 * Now size is 2, so median = (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1]))/2
 * = (max(15, 13) + min(26, 17))/2
 * = (15 + 17)/2
 * = 16
 *
 * complexity O(logn)
 * http://www.geeksforgeeks.org/median-of-two-sorted-arrays/
 */
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,6};
        int[] arr2 = {4,6,8,10};
        int arr1Len = arr1.length;
        int arr2len = arr2.length;

        if(arr1Len == arr2len){
            System.out.println("Median is "+getMedian(arr1,arr2,arr1Len));
        }else{
            System.out.println("Unequal array cannot calculate median");
        }
    }

    private static int getMedian(int[] ar1, int[] ar2, int n){
        {
    /* return -1  for invalid input */
            if (n <= 0)
                return -1;
            if (n == 1)
                return (ar1[0] + ar2[0])/2;
            if (n == 2)
                return (Math.max(ar1[0], ar2[0]) + Math.min(ar1[1], ar2[1])) / 2;

            int m1 = median(ar1, n); /* get the median of the first array */
            int m2 = median(ar2, n); /* get the median of the second array */

    /* If medians are equal then return either m1 or m2 */
            if (m1 == m2)
                return m1;

    /* if m1 < m2 then median must exist in ar1[m1....] and
        ar2[....m2] */
            if (m1 < m2)
            {
                //if (n % 2 == 0)
                    //return getMedian(ar1 + n/2 - 1, ar2, n - n/2 +1);
                //return getMedian(ar1 + n/2, ar2, n - n/2);
            }

    /* if m1 > m2 then median must exist in ar1[....m1] and
        ar2[m2...] */
            //if (n % 2 == 0)
               // return getMedian(ar2 + n/2 - 1, ar1, n - n/2 + 1);
            //return getMedian(ar2 + n/2, ar1, n - n/2);
        }

return -1;
    }

    private static int median(int arr[], int n){
            if (n%2 == 0)
                return (arr[n/2] + arr[n/2-1])/2;
            else
                return arr[n/2];

    }
}
