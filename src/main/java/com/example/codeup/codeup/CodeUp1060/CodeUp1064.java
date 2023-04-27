package com.example.codeup.codeup.CodeUp1060;
import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        int answer = (val1 < val2 ? val1: val2) < val3 ? (val1 < val2 ? val1: val2) : val3;
        System.out.println(answer);
    }
}
