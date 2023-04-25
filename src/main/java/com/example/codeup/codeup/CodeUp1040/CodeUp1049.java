package com.example.codeup.codeup.CodeUp1040;

import java.util.Scanner;

public class CodeUp1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int result = 0;

        if(val1 > val2)
            result = 1;
        else
            result = 0;

        System.out.println(result);
    }
}
