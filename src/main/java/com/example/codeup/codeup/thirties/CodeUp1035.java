package com.example.codeup.codeup.thirties;
import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexVal = sc.nextLine();
        int decVal = Integer.parseInt(hexVal, 16);
        String octNum = Integer.toOctalString(decVal);
        System.out.println(octNum);
    }
}
