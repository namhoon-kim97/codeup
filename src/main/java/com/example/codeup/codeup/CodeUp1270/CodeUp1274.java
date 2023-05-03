package com.example.codeup.codeup.CodeUp1270;

import java.util.Scanner;

public class CodeUp1274 {
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(isPrime(input))
            System.out.println("prime");
        else
            System.out.println("not prime");

    }
}
