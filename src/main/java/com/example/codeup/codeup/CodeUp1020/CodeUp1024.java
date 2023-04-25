package com.example.codeup.codeup.CodeUp1020;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = sc.nextLine().toCharArray();
        for(int i = 0; i < word.length; i++)
            System.out.printf("\'%c\'\n", word[i]);
    }
}
