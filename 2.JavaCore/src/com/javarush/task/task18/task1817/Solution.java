package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static java.lang.Math.round;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(args[0]);
        int count = 0;
        int scount = 0;
        while (fr.ready()) {
            int ch = fr.read();
            scount++;
            if (ch == 32) count++;
        }
        fr.close();
        DecimalFormat df = new DecimalFormat("#.##");
        String roundOff = df.format((count *100.00/ scount));
        System.out.println(roundOff);
    }
}
