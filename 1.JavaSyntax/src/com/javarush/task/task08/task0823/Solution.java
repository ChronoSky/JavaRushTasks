package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String newString = "";
        //напишите тут ваш код
        for (int i = 0; i < string.length(); i++) {
            if (i==0 && string.charAt(i) != ' '){
                newString += string.substring(i, i + 1).toUpperCase();
            }else if ((string.charAt(i) == ' ' && string.charAt(i + 1) != ' ') ) {
                newString += string.substring(i, i + 1) + string.substring(i+1, i + 2).toUpperCase();
                i = i + 1;
            } else {
                newString += string.substring(i, i + 1);
            }

        }

        System.out.println(newString);


    }
}
