package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream fis = new FileInputStream(filename);
        int min = fis.read();
        while (fis.available()>0){
            int i = fis.read();
            if (min > i ) min = i;
        }
        System.out.println(min);
        fis.close();

    }
}
