package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String text = "количество дней в году: %s";
        if (num%400==0){
            System.out.println(String.format(text, 366));
        }else if(num%100==0){
            System.out.println(String.format(text, 365));
        }else if(num%4==0) {
            System.out.println(String.format(text, 366));
        }else{
            System.out.println(String.format(text, 365));
        }

    }
}