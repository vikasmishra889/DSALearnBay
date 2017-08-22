package com.dsa.assignment;

/**
 * Created by vikas.e.mishra on 8/9/2017.
 */
public class RotateMatrix {


    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        int[][] inputArry ={{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] outputArray = new int[row][column];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" "+inputArry[i][j]);
                outputArray[j][i] = inputArry[i][j];
            }
            System.out.println();
        }

        System.out.println("==========================");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" "+outputArray[i][j]);
            }
            System.out.println();
        }

    }
}
