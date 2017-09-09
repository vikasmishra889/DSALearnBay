package com.dsa.SortingSearching.Aug27_17;

/**
 * Created by vikas.e.mishra on 8/27/2017.
 */
public class NQueensProblem {

    int N = 4;

    public static void main(String[] args) {
        int board[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        NQueensProblem nQueensProblem = new NQueensProblem();
        nQueensProblem.solveNQ(board);
        nQueensProblem.print(board);
    }

    public void solveNQ(int[][] board) {

    }

    boolean isSafe(int[][] board, int row, int col) {
        int i, j;
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;

            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public void print(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
