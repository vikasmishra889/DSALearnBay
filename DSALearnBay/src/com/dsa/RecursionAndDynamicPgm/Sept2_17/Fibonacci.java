package com.dsa.RecursionAndDynamicPgm.Sept2_17;

/**
 * Created by vikas.e.mishra on 9/2/2017.
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

//    static int fib(int n) {
//        if (n <= 1)
//            return n;
//        return fib(n - 1) + fib(n - 2);
//    }
//
//    public static void main(String args[]) {
//        int n = 9;
//        System.out.println(fib(5));
//    }


}
