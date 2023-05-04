package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] frame = new int[20][20];

        for(int i = 1; i <= 19; i++){
            for(int j = 1; j <= 19; j++){
                frame[i][j] = sc.nextInt();
            }
        }

        int limit = sc.nextInt();
        int[][] coordinates = new int[limit + 1][2];
        for(int i = 1; i < limit + 1; i++){
            coordinates[i][0] = sc.nextInt();
            coordinates[i][1] = sc.nextInt();
        }

        int count = 0;
        while(count++ < limit){
            for(int i = 1; i <= 19; i++){
                frame[coordinates[count][0]][i] = frame[coordinates[count][0]][i] == 0 ? 1 : 0;
            }
            for(int i = 1; i <= 19; i++){
                frame[i][coordinates[count][1]] = frame[i][coordinates[count][1]] == 0 ? 1 : 0;
            }
        }

        for(int i = 1; i <= 19; i++){
            for(int j = 1; j <= 19; j++){
                System.out.printf("%d ", frame[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
