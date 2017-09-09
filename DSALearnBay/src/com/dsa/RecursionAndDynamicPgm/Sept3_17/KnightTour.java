package com.dsa.RecursionAndDynamicPgm.Sept3_17;

/**
 * Created by vikas.e.mishra on 9/3/2017.
 */
public class KnightTour {

    public static void main(String[] args) {

    }

    private static void findTourPath() {
        int[][] sol = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                sol[i][j] = -1;
            }
        }
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        sol[0][0] = 0;



    }
}
