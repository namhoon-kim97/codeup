package com.example.codeup.codeup.fourties;

import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        char nextAlphabet = (char)(alphabet + 1);
        System.out.println(nextAlphabet);
    }
}
