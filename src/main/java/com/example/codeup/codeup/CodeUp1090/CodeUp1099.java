package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] frame = new int[11][11];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                frame[i][j] = sc.nextInt();
            }
        }

        int i = 2;
        int j = 2;
        while (true) {
            if(frame[i][j] == 2){
                frame[i][j] = 9;
                break;
            }
            if (frame[i][j + 1] == 0) {
                frame[i][j] = 9;
                j++;
            } else if (frame[i + 1][j] == 2 || frame[i][j + 1] == 2) {
                frame[i][j] = 9;
                if (frame[i + 1][j] == 2)
                    i++;
                else
                    j++;
                frame[i][j] = 9;
                break;
            } else if (frame[i + 1][j] == 0) {
                frame[i][j] = 9;
                i++;
            }
            if (i == 9 && j == 9){
                frame[i][j] = 9;
                break;
            }
        }

        for (int m = 1; m <= 10; m++) {
            for (int n = 1; n <= 10; n++)
                System.out.printf("%d ", frame[m][n]);
            System.out.printf("\n");
        }
    }
}
