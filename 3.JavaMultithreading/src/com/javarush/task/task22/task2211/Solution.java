package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Charset secondFile = Charset.forName("UTF-8");
        Charset firstFile = Charset.forName("Windows-1251");

        FileInputStream fis = new FileInputStream(args[0]);
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();

        String sFileText = new String(buffer, firstFile);

        buffer = sFileText.getBytes(secondFile);
        FileOutputStream fos = new FileOutputStream(args[1]);
        fos.write(buffer);
        fos.close();

    }
}
