package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }

        int len = Integer.MAX_VALUE;
        for (String s: strings){
            if (len > s.length()){len=s.length();}
        }

        for (String s: strings){
            if (s.length()==len) System.out.println(s);
        }
    }
}
