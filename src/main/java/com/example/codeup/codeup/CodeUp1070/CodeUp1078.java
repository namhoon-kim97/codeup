package com.example.codeup.codeup.CodeUp1070;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= inputInt; i++){
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
