package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath = br.readLine();

        FileInputStream fis = new FileInputStream(filePath);
        BufferedReader br2 = new BufferedReader(new InputStreamReader(fis));

        while(br2.ready()){
            System.out.println(br2.readLine());
        }
        fis.close();
        br2.close();
        br.close();
    }
}