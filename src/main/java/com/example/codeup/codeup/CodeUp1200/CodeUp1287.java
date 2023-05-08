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
    }
}
