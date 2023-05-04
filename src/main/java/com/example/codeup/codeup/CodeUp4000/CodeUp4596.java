package com.example.codeup.codeup.CodeUp4000;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = -1;
        int[] index = new int[2];
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                int input = sc.nextInt();
                if(maxNum < input) {
                    maxNum = input;
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(index[0] + " " + index[1]);
    }
}
