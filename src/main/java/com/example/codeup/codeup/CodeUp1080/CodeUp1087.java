package com.example.codeup.codeup.CodeUp1080;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
            if(sum >= num) break;
        }
        System.out.println(sum);
    }
}
