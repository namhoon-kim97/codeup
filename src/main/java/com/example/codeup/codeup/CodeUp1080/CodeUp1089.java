package com.example.codeup.codeup.CodeUp1080;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int diff = sc.nextInt();
        int lastIndex = sc.nextInt();
        int result = start;

        for(int i = 2; i <= lastIndex; i++){
            result += diff;
        }
        System.out.println(result);
    }
}
