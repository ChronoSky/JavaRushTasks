package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        String file3 = br.readLine();

        FileOutputStream fos = new FileOutputStream(file1);
        FileInputStream fis1 = new FileInputStream(file2);
        byte[] buffer = new byte[fis1.available()];
        int count1 = 0;
        if (fis1.available() > 0) {
            count1 = fis1.read(buffer);
        }

        fos.write(buffer, 0, count1);
        fos.flush();
        fis1.close();

        FileInputStream fis2 = new FileInputStream(file3);
        byte[] buffer2 = new byte[fis2.available()];
        int count2 = 0;
        if (fis2.available() > 0) {
            count2 = fis2.read(buffer2);
        }

        fos.write(buffer2, 0, count2);
        fos.flush();
        fis2.close();
        fos.close();

    }
}
