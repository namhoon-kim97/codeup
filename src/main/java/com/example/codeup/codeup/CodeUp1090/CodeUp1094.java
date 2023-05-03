package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[count];

        for(int i = 0; i < count; i++)
            numbers[i] = sc.nextInt();

        for(int i = count - 1; i >= 0; i--)
            System.out.printf("%d ", numbers[i]);
    }
}
