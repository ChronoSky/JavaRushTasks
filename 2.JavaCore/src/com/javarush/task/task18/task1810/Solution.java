package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        FileInputStream fis;
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            fis = new FileInputStream(filename);
            if (fis.available()<1000) {
                fis.close();
                reader.close();
                throw new DownloadException();
            }
        } while(true);

    }

    public static class DownloadException extends Exception {

    }
}
