package com.example.codeup.codeup.CodeUp1120;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("H");
        input[0] = input[0].substring(1);


        int carbon = Integer.parseInt(input[0]);
        int hydrogen = Integer.parseInt(input[1]);
        System.out.println(carbon * 12 + hydrogen);
    }
}
