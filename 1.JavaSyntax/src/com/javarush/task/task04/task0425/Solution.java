package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        if (num1 > 0 && num2>0){
            System.out.println("1");
        }else if (num1 > 0 && num2<0){
            System.out.println("4");
        }else if (num1 < 0 && num2>0){
            System.out.println("2");
        }else if (num1 < 0 && num2<0){
            System.out.println("3");
        }
    }
}
