package com.example.codeup.codeup.CodeUp1080;

import java.util.Scanner;

public class CodeUp1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0) continue;
            System.out.printf("%d ", i);
        }
    }
}
