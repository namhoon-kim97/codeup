package com.example.codeup.codeup.CodeUp1040;

import java.util.Scanner;
public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        long val1 = sc.nextLong();
        long val2 = sc.nextLong();
        System.out.println(val1 + val2);
        System.out.println(val1 - val2);
        System.out.println(val1 * val2);
        System.out.println(val1 / val2);
        System.out.println(val1 % val2);
        System.out.printf("%.2f", (val1 / (float)val2));
    }
}
