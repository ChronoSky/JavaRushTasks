package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);
        Map<Integer, Integer> map = new HashMap<>();
        while (fis.available() > 0) {
            int sim = fis.read();
            if (map.containsKey(sim)) {
                int count = map.get(sim);
                map.put(sim, count + 1);
            } else {
                map.put(sim, 1);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (Integer i : list){
            char c = (char)((int)i);
            System.out.println(c + " " + map.get(i) );
        }
        fis.close();
    }
}
