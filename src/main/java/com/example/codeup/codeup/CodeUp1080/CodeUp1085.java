package com.example.codeup.codeup.CodeUp1080;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();
        System.out.printf("%.1f MB", (h*b*c*s) / Math.pow(2, 23));
    }
}
