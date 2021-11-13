package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String num1 = br.readLine();
        String num2 = br.readLine();

        System.out.println(name + " получает "+ num1 +" через "+ num2 +" лет.");

    }
}
