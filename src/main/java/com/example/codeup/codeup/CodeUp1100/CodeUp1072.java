package com.example.codeup.codeup.CodeUp1100;

import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] values = new int[count];
        for(int i = 0; i < count; i++){
            values[i] = sc.nextInt();
        }
        for(int i = 0; i < count; i++){
            System.out.println(values[i]);
        }
    }
}
