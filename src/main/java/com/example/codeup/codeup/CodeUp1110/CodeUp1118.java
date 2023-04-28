package com.example.codeup.codeup.CodeUp1110;

import java.util.Scanner;

public class CodeUp1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseLine = sc.nextInt();
        int height = sc.nextInt();
        System.out.printf("%.1f", baseLine * height / 2.0f);
    }
}
