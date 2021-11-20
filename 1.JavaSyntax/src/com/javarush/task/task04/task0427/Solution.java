package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String snum = br.readLine();
        int num = Integer.parseInt(snum);
        String text = "";

        if (num>0 && num<1000){
            boolean ch = (num%2==0);
            if (ch) {
                text = "четное ";
            }else {
                text = "нечетное  ";
            }

            if (snum.length()==3){
                text += "трехзначное ";
            }else if (snum.length()==2){
                text += "двузначное ";
            }else if (snum.length()==1){
                text += "однозначное ";
            }

            text += "число";

            System.out.println(text);
        }
    }
}
