package com.dsa.RecursionAndDynamicPgm.Sept3_17;

/**
 * Created by vikas.e.mishra on 9/3/2017.
 */
public class MinimumCostPath {

    public static void main(String[] args) {
        int cost[][] = {{1, 3, 5, 6}, {4, 2, 1, 7}, {4, 3, 2, 1}};
        System.out.println("Min cost is" +minPath(cost, 2, 3));

    }

    private static int minPath(int cost[][], int m, int n) {

        int tc[][] = new int[m + 1][n + 1];

        tc[0][0] = cost[0][0];


        for (int i = 1; i <= m; i++) {
            tc[i][0] = tc[i - 1][0] + cost[i][0];
        }

        for (int j = 1; j <= n; j++) {
            tc[0][j] = tc[0][j - 1] + cost[0][j];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                tc[i][j] = cost[i][j] + Math.min(tc[i - 1][j], tc[i][j - 1]);
                //tc[i][j] = min(tc[i-1][j-1],tc[i-1][j], tc[i][j-1]) + cost[i][j];
            }
        }
        return tc[m][n];
    }

}
