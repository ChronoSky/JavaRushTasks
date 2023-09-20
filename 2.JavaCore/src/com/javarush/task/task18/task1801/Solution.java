package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream fis = new FileInputStream(filename);
        int max = fis.read();
        while (fis.available() > 0) {
            int i = fis.read();
            if (i > max) max = i;
        }
        System.out.println(max);
        fis.close();

    }
}
