package com.example.codeup.codeup.CodeUp1600;

import java.util.Scanner;

public class CodeUp1671 {
    public static String play(int user, int computer){
        if(user == 0 && computer == 1){
            return "win";
        } else if(user == 1 && computer == 2){
            return "win";
        } else if(user == 2 && computer == 0){
            return "win";
        } else if(user == computer){
            return "tie";
        } else {
            return "lose";
        }
    }

    public static void main(String[] args) {
        // 0바위 1가위 2보
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();
        System.out.println(play(user, computer));
    }
}
