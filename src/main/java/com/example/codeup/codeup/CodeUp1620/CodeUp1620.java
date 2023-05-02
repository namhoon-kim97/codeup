package com.example.codeup.codeup.CodeUp1620;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = num;

        while(num >= 10) {
            answer = 0;
            while (num > 0) {
                answer += num % 10;
                num /= 10;
            }
           num = answer;
        }
        System.out.println(answer);
    }
}
