package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        try (BufferedReader bfr = new BufferedReader(new FileReader(fileName))){
            while(bfr.ready()){
                String[] line = bfr.readLine().trim().split(" ");
                StringBuilder sb = new StringBuilder();
                for (String word : line){

                    if (word.matches("(10|11|12|\\d)([.,]?)")){
                        Pattern p = Pattern.compile("(10|11|12|\\d)([.,]?)");
                        Matcher m = p.matcher(word);
                        while(m.find()){
                            sb.append(map.get(Integer.parseInt(m.group(1)))).append(m.group(2));
                        }
                    }else{
                        sb.append(word);
                    }
                    sb.append(" ");
                }
                System.out.println(sb.toString().trim());
            }
        }catch(IOException e){

        }
    }
}
