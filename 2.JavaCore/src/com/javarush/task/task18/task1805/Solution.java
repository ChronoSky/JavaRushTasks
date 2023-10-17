package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();

        FileInputStream fis = new FileInputStream(filename);
        List<Integer> list = new ArrayList<>();
        while (fis.available() > 0) {
            int i = fis.read();
            if (!list.contains(i)) {
                list.add(i);
            }

        }

        Collections.sort(list);
        boolean flag = false;
        for (Integer v : list) {
            if (flag) {
                System.out.print(" ");
            }
            flag = true;
            System.out.print(v);
        }
        fis.close();
    }
}
