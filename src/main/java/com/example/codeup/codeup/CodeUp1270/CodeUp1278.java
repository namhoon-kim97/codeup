package com.example.codeup.codeup.CodeUp1270;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
