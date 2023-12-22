package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = br.readLine();
        String filename2 = br.readLine();
        br.close();

        try (BufferedReader brR = new BufferedReader(new FileReader(filename1))) {
            try (BufferedWriter brW = new BufferedWriter(new FileWriter(filename2))) {
                String line;
                while ((line = brR.readLine()) != null) {
                    brW.write(line.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~\\n]", ""));
                    brW.flush();
                }
            }
        } catch (Exception e) {
        }
    }
}
