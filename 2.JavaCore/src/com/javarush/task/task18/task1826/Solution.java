package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);

        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        int bufferSize = buffer.length;

        byte[] newBuffer = new byte[bufferSize];

        switch (args[0]) {
            case "-e":
            case "-d":
                for (int i = 0; i < bufferSize; i++) {
                    newBuffer[i] = buffer[bufferSize-1-i];
                }
                fos.write(newBuffer);
                break;
        }
        fis.close();
        fos.close();

    }

}
