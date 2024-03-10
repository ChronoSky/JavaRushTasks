package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        StringBuilder listWords = new StringBuilder();

        try(BufferedReader bfr = new BufferedReader(new FileReader(args[0]))){
            while(bfr.ready()){
                String[] line = bfr.readLine().trim().split(" ");
                for (String word : line){
                    if (word.matches(".*\\d.*")) listWords.append(word).append(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter fw = new FileWriter(args[1])){
            fw.write(listWords.toString().trim());
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
