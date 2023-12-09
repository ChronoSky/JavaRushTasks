package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();

        FileInputStream fis = new FileInputStream(file1);
        byte[] buffer1 = new byte[fis.available()];
        fis.read(buffer1);
        fis.close();

        FileOutputStream fos = new FileOutputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        byte[] buffer2 = new byte[fis2.available()];
        fis2.read(buffer2);
        fis2.close();

        fos.write(buffer2);
        fos.write(buffer1);
        fos.close();
    }
}
