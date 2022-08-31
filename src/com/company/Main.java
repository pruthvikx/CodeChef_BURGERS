package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0;i<testCase;i++){
            int bun = scan.nextInt();
            int patty = scan.nextInt();
            if (bun <= patty){
                System.out.println(bun);
            }else if (patty <= bun){
                System.out.println(patty);
            }else {
                System.out.println("error");
            }
        }
    }
}
