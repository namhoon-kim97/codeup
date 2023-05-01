package com.example.codeup.codeup.CodeUp1080;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;
        int lastInt = 0;
        for(int i = 0; i <= limit; i++){
            sum += i;
            if(sum >= limit){
                lastInt = i;
                break;
            }
        }
        System.out.println(lastInt);

    }
}
