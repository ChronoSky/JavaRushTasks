package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        int countplus = 0;
        int countminus = 0;
        if (num1>0) {countplus++;} else if (num1<0) {countminus++;}
        if (num2>0) {countplus++;} else if (num2<0) {countminus++;}
        if (num3>0) {countplus++;} else if (num3<0) {countminus++;}
        System.out.println("количество отрицательных чисел: " + countminus);
        System.out.println("количество положительных чисел: " + countplus);
    }
}
