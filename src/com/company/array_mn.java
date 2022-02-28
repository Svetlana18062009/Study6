package com.company;

public class array_mn {
    public static void main(String[]args){
        // Многомерные массивы
        char[][] syms=new char[2][2];
        syms[0][0]='t';
        syms[1][1]='s';
        System.out.println(syms[1][1]);
        byte[][] nums =new byte[][]{
                {5,7},
                {6,9},
                {3,4}
        };
        //nums[1][1]=67; многомерные массивы
        System.out.println(nums[0][1]);
    }
}
