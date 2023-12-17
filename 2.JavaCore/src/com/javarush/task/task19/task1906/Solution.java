package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = br.readLine();
        String filename2 = br.readLine();
        br.close();

        FileReader fr = new FileReader(filename1);
        FileWriter fw = new FileWriter(filename2);
        int count = 0;
        while (fr.ready()) {
            int data = fr.read();
            count++;
            if (count%2==0) fw.write(data);
        }
        fr.close();
        fw.close();

    }
}
