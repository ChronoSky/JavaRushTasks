package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        if (count>0) {
            int maximum = Integer.parseInt(reader.readLine());

            for (int i=0; i<count-1; i++){
                int num = Integer.parseInt(reader.readLine());
                maximum = Math.max(maximum, num);
            }
            System.out.println(maximum);
        }
    }
}
