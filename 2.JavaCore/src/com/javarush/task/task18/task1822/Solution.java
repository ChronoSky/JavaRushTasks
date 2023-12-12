package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();

        BufferedReader brf = new BufferedReader(new FileReader(filename));
        while(brf.ready()){
            String line = brf.readLine();
            String actId = line.split(" ")[0];
            if (args[0].equals(actId)){
                System.out.println(line);
            }
        }
        brf.close();
        br.close();



    }
}
