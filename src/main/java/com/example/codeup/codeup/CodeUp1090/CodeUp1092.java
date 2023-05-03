package com.example.codeup.codeup.CodeUp1090;

import java.util.Scanner;

public class CodeUp1092 {
    public static int gcd(int maxNum,int minNum){
        int temp;
        while(minNum != 0){
            temp = maxNum % minNum;
            maxNum = minNum;
            minNum = temp;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r = (a * b) / gcd(Math.max(a,b), Math.min(a,b));
        int result = (r * c) / gcd(Math.max(r,c), Math.min(r,c));
        System.out.println(result);
    }
}
