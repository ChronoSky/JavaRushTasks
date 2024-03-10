package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {

        String fileName1 = args[0];
        String fileName2 = args[1];

        StringBuilder sb = new StringBuilder();
        try (BufferedReader bfr = new BufferedReader(new FileReader(fileName1))) {
            while (bfr.ready()) {
                String[] line = bfr.readLine().split(" ");
                for (String word : line) {
                    if (word.length() > 6) {
                        if (sb.toString().equals("")){
                            sb.append(word);
                        }else{
                            sb.append(",").append(word);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(fileName2)) {
            fw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
