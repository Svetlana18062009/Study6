package com.company;
public class Andersen3 {
    public static void main(String[] args) {
        // массивы данных
       int[] arr= new int[] {10,50,70,90,120};
         for (int i =0;i<arr.length;i++)
             if (arr[i]%3==0) {
                 System.out.println(arr[i]);
             }

    }

}