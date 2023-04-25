package com.example.codeup.codeup.CodeUp1020;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split(":");
        System.out.printf("%s", Integer.parseInt(date[1]));
    }
}
