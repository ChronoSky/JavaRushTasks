package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        try(BufferedReader fbr = new BufferedReader(new FileReader(fileName))){
            while (fbr.ready()){
                String textLine = fbr.readLine();
                String[] line = textLine.split(" ");
                int count = 0;
                for (String word : line){
                    if (words.contains(word)) count++;
                }
                if (count==2) {
                    System.out.println(textLine);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
