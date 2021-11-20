package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(br.readLine());
        double t = d%5;
        if (t<3){
            System.out.println("зелёный");
        }else if(t>=3 && t<4){
            System.out.println("жёлтый");
        }else if(t>=4 || t==0){
            System.out.println("красный");
        }



    }
}