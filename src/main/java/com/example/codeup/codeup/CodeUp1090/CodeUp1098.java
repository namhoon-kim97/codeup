package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int frameX = sc.nextInt();
        int frameY = sc.nextInt();
        int count = sc.nextInt();
        int[][] sticks = new int[count][4];
        int[][] frame = new int[frameX+1][frameY+1];

        for(int i = 1; i <= frameX; i++)
            for(int j = 1; j <= frameY; j++)
                frame[i][j] = 0;

        for(int i = 0; i < count; i++)
            for(int j = 0; j < 4; j++)
                sticks[i][j] = sc.nextInt();

        while(count-- > 0){
            if(sticks[count][1] == 0){
                //가로 + sticks[count][0];
                for(int i = 0; i < sticks[count][0]; i++)
                    frame[sticks[count][2]][sticks[count][3] + i] = 1;
            } else {
                //세로 + sticks[count][0]
                for(int i = 0; i < sticks[count][0]; i++)
                    frame[sticks[count][2] + i][sticks[count][3]] = 1;
            }
        }

        for(int i = 1; i <= frameX; i++) {
            for (int j = 1; j <= frameY; j++)
                System.out.printf("%d ", frame[i][j]);
            System.out.printf("\n");
        }
    }
}
