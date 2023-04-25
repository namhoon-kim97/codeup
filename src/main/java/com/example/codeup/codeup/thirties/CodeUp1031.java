package com.example.codeup.codeup.thirties;

import java.util.Scanner;

public class CodeUp1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        String octNum  = Integer.toOctalString(val);
        System.out.println(octNum);
    }
}
