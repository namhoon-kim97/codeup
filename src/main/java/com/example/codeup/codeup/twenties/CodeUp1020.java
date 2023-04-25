package com.example.codeup.codeup.twenties;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] numsSplit = nums.split("-");
        System.out.printf("%s%s", numsSplit[0], numsSplit[1]);
    }
}
