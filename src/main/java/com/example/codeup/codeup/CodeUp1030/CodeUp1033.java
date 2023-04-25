package com.example.codeup.codeup.CodeUp1030;
import java.util.Scanner;

public class CodeUp1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        String hexNum  = Integer.toHexString(val);
        System.out.println(hexNum.toUpperCase());
    }
}
