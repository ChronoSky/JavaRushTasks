package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        int max, min, avg;

        // определили минимальное и максимально между 1 и 3
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);

        if (num3>max){
            avg = max;
            max = num3;
        } else if (num3<min){
                avg = min;
                min = num3;

        } else {
            avg = num3;
        }

        System.out.println(max + " " + avg + " " + min);


    }
}
