package com.example.codeup.codeup.CodeUp1070;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputAlphabet = sc.next().charAt(0);
        for(char i = 'a'; i <= inputAlphabet; i++)
            System.out.printf("%c ", i);
    }
}
