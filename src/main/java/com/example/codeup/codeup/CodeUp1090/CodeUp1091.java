package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int times = sc.nextInt();
        int plus = sc.nextInt();
        int lastIndex = sc.nextInt();
        long result = start;

        for(int i = 2; i <= lastIndex; i++){
            result = result * times + plus;
        }
        System.out.println(result);
    }
}
