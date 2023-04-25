package com.example.codeup.codeup.twenties;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fNum = sc.nextLine();
        String[] fNumSplit = fNum.split("\\.");
        System.out.println(fNumSplit[0]);
        System.out.println(fNumSplit[1]);
    }
}
