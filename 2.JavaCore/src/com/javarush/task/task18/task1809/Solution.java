package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        fileName1 = br.readLine();
        fileName2 = br.readLine();

        FileInputStream fis = new FileInputStream(fileName1);
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);


        FileOutputStream fos = new FileOutputStream(fileName2);
        for (int i = 0; i < buffer.length; i++) {
            fos.write(buffer[buffer.length-i-1]);
        }
        fos.flush();

        fis.close();
        fos.close();
        br.close();

    }
}
