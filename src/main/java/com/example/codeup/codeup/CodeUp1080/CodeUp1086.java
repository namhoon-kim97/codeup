package com.example.codeup.codeup.CodeUp1080;
import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        long h = sc.nextInt();
        long b = sc.nextInt();

        System.out.printf("%.2f MB", (w*h*b) / Math.pow(2, 23));
    }
}
