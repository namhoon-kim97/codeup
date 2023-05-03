package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[count + 1];
        int[] students = new int[24];

        for(int i = 1; i <= count; i++)
            numbers[i] = sc.nextInt();
        for(int i = 1; i <= count; i++){
            students[numbers[i]]++;
        }
        for(int i = 1; i <= 23; i++)
            System.out.printf("%d ", students[i]);
    }
}
