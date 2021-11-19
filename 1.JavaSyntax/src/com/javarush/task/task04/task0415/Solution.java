package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        if ((num1+num2 > num3) && (num3+num2 > num1) && (num1+num3 > num2)){
            System.out.println("Треугольник существует.");
        }else {
            System.out.println("Треугольник не существует.");
        }
    }
}