package com.example.codeup.codeup.CodeUp1020;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split("\\.");
        System.out.printf("%s-%s-%s", date[2], date[1], date[0]);
    }
}
