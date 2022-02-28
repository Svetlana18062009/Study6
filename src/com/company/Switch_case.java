package com.company;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args){
        // условная конструкция switch-case
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println(" The end");
        }
    }
}
