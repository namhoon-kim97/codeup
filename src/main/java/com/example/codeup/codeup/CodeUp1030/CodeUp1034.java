package com.example.codeup.codeup.CodeUp1030;
import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octVal = sc.nextLine();
        int decNum = Integer.parseInt(octVal, 8);
        System.out.println(decNum);
    }
}
