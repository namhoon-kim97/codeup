package com.example.codeup.codeup.tens;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String days = sc.nextLine();
        String[] daysSplit = days.split("\\.");

        int year = Integer.parseInt(daysSplit[0]);
        int month = Integer.parseInt(daysSplit[1]);
        int day = Integer.parseInt(daysSplit[2]);
        System.out.printf("%04d.%02d.%02d", year,month,day);
    }
}
