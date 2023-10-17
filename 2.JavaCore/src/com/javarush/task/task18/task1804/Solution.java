package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream fis = new FileInputStream(filename);
        Map<Integer, Integer> map = new HashMap<>();
        int i = fis.read();
        map.put(i, 1);
        while (fis.available() > 0) {
            i = fis.read();
            if (map.containsKey(i)) {
                int count = map.get(i) + 1;
                map.put(i, count);
            } else {
                map.put(i, 1);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Integer p : map.values()) {
            if (min > p) min = p;
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == min) {
                System.out.print(pair.getKey());
                System.out.print(" ");
            }
        }
        fis.close();
    }
}
