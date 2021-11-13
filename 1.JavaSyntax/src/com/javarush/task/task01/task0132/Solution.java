package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int num1 = number/100; // 5
        int num2 = (number - num1 * 100)/10; //4
        int num3 = number - num1 * 100 - num2 * 10;  //6
        return num1 + num2 + num3;
    }
}