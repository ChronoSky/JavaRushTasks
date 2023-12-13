package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String fileName = br.readLine();

            try (FileReader fr = new FileReader(fileName)) {

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }


    }
}
