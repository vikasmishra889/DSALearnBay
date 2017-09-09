package com.dsa.assignment.Aug27_17;

/**
 * Created by vikas.e.mishra on 9/7/2017.
 */
public class MinimumNumberOfCounts {

    public static void main(String[] args) {
        int n = 20;
        System.out.println("Highest factor of " + n + " is " + highestPrimeFactor(n));
    }

    private static int highestPrimeFactor(int n) {
        int num = n;
        int i = 0;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                num = num / i;
                i--;
            }
        }
        return i;
    }
}
