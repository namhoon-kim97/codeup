package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[count];
        int min = 10001;
        int temp;

        for(int i = 0; i < count; i++) {
             temp = sc.nextInt();
             if(temp < min)
                 min = temp;
        }
        System.out.println(min);

    }
}
