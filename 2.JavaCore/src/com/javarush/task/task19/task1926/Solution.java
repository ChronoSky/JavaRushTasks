package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        try (BufferedReader bfr = new BufferedReader(new FileReader(fileName))) {
            while (bfr.ready()) {
                System.out.println(new StringBuilder(bfr.readLine()).reverse().toString());
            }
        } catch (IOException e) {

        }

    }
}
