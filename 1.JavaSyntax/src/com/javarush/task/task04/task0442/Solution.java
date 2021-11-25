package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int sum=0;
        do {
            num = Integer.parseInt(br.readLine());
            sum+= num;
        }while(num!=-1);
        System.out.println(sum);
    }
}
