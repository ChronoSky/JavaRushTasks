package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        br.close();


        BufferedReader brf = new BufferedReader(new FileReader(filename));
        int count = 0;
        String line;
        while ((line = brf.readLine()) != null) {
            // Разбиваем строку на слова, разделенные пробелами
            String[] words = line.split("\\W");
            for (String s : words) {
                if (s.equals("world")) count++;
            }
        }
        System.out.println(count);
        brf.close();
    }
}
