package com.dsa.RecursionAndDynamicPgm.Sept2_17;

/**
 * Created by vikas.e.mishra on 9/2/2017.
 * <p>
 * Given a floor of size n x m and tiles of size 1 x m. The problem is to count the number of ways to tile
 * the given floor using 1 x m tiles. A tile can either be placed horizontally or vertically.
 * Both n and m are positive integers and 2 < = m.
 * <p>
 * Input : n = 2, m = 3
 * Output : 1
 * Only one combination to place
 * two tiles of size 1 x 3 horizontally
 * on the floor of size 2 x 3.
 * <p>
 * Input :  n = 4, m = 4
 * Output : 2
 * 1st combination:
 * All tiles are placed horizontally
 * 2nd combination:
 * All tiles are placed vertically.
 * <p>
 * |  1, 1 < = n < m
 * count(n) =   |  2, n = m
 * | count(n-1) + count(n-m), m < n
 * <p>
 * http://www.geeksforgeeks.org/count-number-ways-tile-floor-size-n-x-m-using-1-x-m-size-tiles/
 */
public class TilingProblem {

    public static void main(String[] args) {
        int n = 7, m = 4;
        System.out.println("Number of ways " + countWays(n, m));
    }

    private static int countWays(int n, int m) {
        // table to store values
        // of subproblems
        int[] count = new int[n+1];
        count[0] = 0;

        // Fill the table upto value n
        for (int i = 1; i <= n; i++) {
            // recurrence relation
            if (i > m)
                count[i] = count[i - 1] + count[i - m];

                // base cases
            else if (i < m)
                count[i] = 1;

                // i = = m
            else
                count[i] = 2;
        }

        // required number of ways
        return count[n];
    }
}
