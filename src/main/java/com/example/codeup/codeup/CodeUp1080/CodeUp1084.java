package com.example.codeup.codeup.CodeUp1080;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int count = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < red; i++){
            for(int j = 0; j < green; j++){
                String answer = "";
                for(int k = 0; k < blue; k++){
                    answer += i + " " + j + " " + k + "\n";
                    count++;
                }
                bw.write(answer);
                bw.flush();
            }
        }
        System.out.println(count);
    }
}
