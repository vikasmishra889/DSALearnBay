package com.dsa.RecursionAndDynamicPgm.Sept3_17;

/**
 * Created by vikas.e.mishra on 9/3/2017.
 *
 * Do with recursion.
 */
public class Selection {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i=0;i<arr.length;i++){
            for(int j = i; j<arr.length;j++)
                System.out.print(""+arr[i]+" "+arr[j]);
        }
    }


}
