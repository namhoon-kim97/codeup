package com.example.codeup.codeup.twenties;

import java.util.Scanner;
import static java.lang.Math.pow;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num = sc.nextLine().toCharArray();
        for(int i = 0; i < num.length; i++)
            System.out.printf("[%d]\n", (int)(num[i] - '0') * (int)Math.pow(10, num.length - 1 - i));
    }
}
