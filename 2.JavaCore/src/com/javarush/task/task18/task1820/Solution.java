package com.javarush.task.task18.task1820;

import jdk.jfr.events.FileReadEvent;

import java.io.*;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        FileReader fr = new FileReader(file1);
        FileWriter fw = new FileWriter(file2);
        BufferedReader br2 = new BufferedReader(new FileReader(file1));
        StringBuilder sb = new StringBuilder();
        while (br2.ready()) {
            sb.append(br2.readLine()).append(" ");
        }
        fr.close();
        String[] nums = sb.toString().split(" ");

        StringBuilder sbNew = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
           int num = (int)Math.round(Double.parseDouble(nums[i]));
           if (i==0){
               sbNew.append(num);
           } else {
               sbNew.append(" ").append(num);
           }
        }

        fw.write(sbNew.toString());
        fw.flush();
        fw.close();

    }
}
