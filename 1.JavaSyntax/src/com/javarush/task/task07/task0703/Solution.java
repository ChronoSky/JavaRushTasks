package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] arStr = new String[10];
        int[] arint = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String txt = br.readLine();
            arStr[i] = txt;
            arint[i] = txt.length();
        }

        for (int i: arint){
            System.out.println(i);
        }


    }
}
