package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] frame = new int[20][20];
        int[][] whites = new int[count][2];
        for(int i = 0; i < count; i++){
            whites[i][0] = sc.nextInt();
            whites[i][1] = sc.nextInt();
        }

        for(int i = 0; i < count; i++){
            frame[whites[i][0]][whites[i][1]] = 1;
        }

        for(int i = 1; i <= 19; i++){
            for(int j = 1; j <= 19; j++){
                System.out.printf("%d ", frame[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
