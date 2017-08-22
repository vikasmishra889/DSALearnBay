package com.dsa.array.Aug6_17;

/**
 * Created by vikas.e.mishra on 8/6/2017.
 */
public class TrappingRainWater {

    public static void main(String[] args) {

        int arr[] = {2,0,0,5,0,0,3};
        int lowPtr = 0;
        int highPtr = arr.length -1;
        int leftMax = 0;
        int rightMax = 0;
        int output =0;
        while(lowPtr <= highPtr)
        {
            if(arr[lowPtr] < arr[highPtr])
            {
                if(arr[lowPtr] > leftMax) {
                    leftMax = arr[lowPtr];
                }else {
                    output = output + leftMax - arr[lowPtr];
                }
                lowPtr++;
            }
            else
            {
                if(arr[highPtr] > rightMax)
                    rightMax = arr[highPtr];
                else
                    output += rightMax - arr[highPtr];
                highPtr--;
            }
        }
        System.out.println(output);
    }
}
