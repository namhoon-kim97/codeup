package com.example.codeup.codeup.CodeUp1080;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int hexNum = Integer.parseInt(input, 16);
        for(int i = 1; i < 16; i++){
            System.out.printf("%s*%X=%X\n", input, i, i * hexNum);
        }
    }
}
