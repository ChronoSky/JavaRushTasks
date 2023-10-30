package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream inputStream =  new FileInputStream(fileName);
        int c = 0;
        if (inputStream.available()>0){
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            for (int ci : buffer){
                if (ci == 44) c++;
            }
        }
        System.out.println(c);

        inputStream.close();

    }
}
