package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);
        int count = 0;
        while(fis.available()>0){
            int simbol = fis.read();
            if ((simbol>=97 && simbol<=122) || (simbol>=65 && simbol<=90)) count++;
        }
        System.out.println(count);
        fis.close();
    }
}
