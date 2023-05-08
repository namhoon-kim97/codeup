package com.example.codeup.codeup.CodeUp1200;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 1; i <= 9; i++) {
            for (int j = 1; j <= count * i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        // 직각삼각형 만들기
        /*for(int i = 0; i < count; i++){
            for(int j = 0; j <= i; j++)
                System.out.printf("*");
            System.out.println("");
        }*/
    }
}
