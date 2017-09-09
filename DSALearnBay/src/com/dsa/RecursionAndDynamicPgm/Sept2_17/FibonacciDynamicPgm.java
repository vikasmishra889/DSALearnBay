package com.dsa.RecursionAndDynamicPgm.Sept2_17;

/**
 * Created by vikas.e.mishra on 9/2/2017.
 */
public class FibonacciDynamicPgm {

    // Bottom Up
    static int fibBottomUp(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 1];
        int i;

    /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;
        System.out.print(f[0] + " " + f[1]);

        for (i = 2; i <= n; i++) {
       /* Add the previous 2 numbers in the series
         and store it */
            f[i] = f[i - 1] + f[i - 2];
            System.out.print(" " + f[i]);
        }
        System.out.println();
        return f[n];
    }


    // Top Down
    static int fibTopDown(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 1];

        if (f[n] > 0) {
            return f[n];
        }
        if (n <= 1) {
            return n;
        }
        f[n] = fibTopDown(n - 1) + fibTopDown(n - 2);
        return f[n];
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println("From bottom UP");
        System.out.println(n + " th fib number is " + fibBottomUp(n));
        System.out.println("From top Down");
        System.out.println(n + " th fib number is " + fibTopDown(n));
    }
}
