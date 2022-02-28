package com.company;
import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Метод выводит на экран информацию
        System.out.print("Введите число с точкой:");
        Float num= scan.nextFloat();// Пользователь вводит число с точкой
        System.out.println("Ваше число-"+ num);// Система выводит введенное число
    }

    }