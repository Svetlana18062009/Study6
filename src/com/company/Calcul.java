package com.company;
import java.util.Scanner;
public class Calcul {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите 1 число:");//запрашивает ввод числа
        int num1 = scanner.nextInt();// ввод числа
        System.out.print("Введите 2 число:");
        int num2 = scanner.nextInt();
        int res;// Создаем переменную РЕЗУЛЬТАТ
        System.out.print("Действие:"); // Выводит слово ДЕЙСТВИЕ
        String action= scanner.nextLine();//Пользователь вводит действие
        action = scanner.nextLine();// Так надл
        switch (action){ // Включает дествие
            case"+":
            res = num1+num2;
            System.out.println("Результат:"+res); //Выводит результат (+)
            break;
            case "-":
             res = num1-num2;
             System.out.println("Результат:"+res);
             break;
            case "*":
                res=num1*num2;
                System.out.println("Результат:"+res);
                break;
            case"/":
                res= num1/num2;
                System.out.println("Результат"+res);
                break;
            default:
                System.out.println("Вы ввели что то не то");
        }


    }
}
