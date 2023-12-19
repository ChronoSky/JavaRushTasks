package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = br.readLine();
        String filename2 = br.readLine();
        br.close();

        try (BufferedReader brf = new BufferedReader(new FileReader(filename1))) {
            try (BufferedWriter bwf = new BufferedWriter(new FileWriter(filename2))) {
                String line;
                while ((line = brf.readLine()) != null) {
                    String[] words = line.split(" ");
                    for (String w : words) {
                        try {
                            Integer.parseInt(w);
                            bwf.write(w);
                            bwf.write(" ");
                        } catch (Exception e) {
                        }
                    }
                    bwf.flush();
                }

            }
        } catch (Exception e) {
        }

    }
}
