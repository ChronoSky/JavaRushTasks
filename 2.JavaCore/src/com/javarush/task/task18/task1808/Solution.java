package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName1;
        String fileName2;
        String fileName3;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        fileName1 = br.readLine();
        fileName2 = br.readLine();
        fileName3 = br.readLine();


        FileInputStream fis = new FileInputStream(fileName1);
        int len = fis.available();
        int mid;
        if (len % 2 == 0) {
            mid = len / 2;
        } else {
            mid = (len / 2) + 1;
        }

        FileOutputStream outputStream1 = new FileOutputStream(fileName2);

        byte[] buffer = new byte[mid];
        fis.read(buffer);
        outputStream1.write(buffer);

        outputStream1.flush();
        outputStream1.close();

        FileOutputStream outputStream2 = new FileOutputStream(fileName3);

        buffer = new byte[len / 2];
        fis.read(buffer);
        outputStream2.write(buffer);

        outputStream2.flush();
        outputStream2.close();
        fis.close();
        br.close();
    }
}
