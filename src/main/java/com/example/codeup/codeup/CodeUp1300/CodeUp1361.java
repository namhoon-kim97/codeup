package com.example.codeup.codeup.CodeUp1300;

import java.util.Scanner;

public class CodeUp1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for(int i = 0; i < height; i++){
            for(int j = 0; j < i; j++)
                System.out.printf(" ");
            System.out.printf("**\n");
        }
    }
}
