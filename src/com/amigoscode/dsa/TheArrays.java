package com.amigoscode.dsa;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println(Arrays.deepToString(board));

        char[][] boardTwo = new char[][]{
                new char[]{'O','-','-'},
                new char[]{'-','O','-'},
                new char[]{'-','-','O'},
        };

        System.out.println(Arrays.deepToString(boardTwo));

    }
}
