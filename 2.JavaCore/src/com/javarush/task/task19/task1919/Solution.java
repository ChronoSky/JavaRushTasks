package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader fbr = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new HashMap<String, Double>();
        while (fbr.ready()) {
            String line = fbr.readLine();
            String name = line.split(" ")[0];
            double value = Double.parseDouble(line.split(" ")[1]);
            if (map.containsKey(name)) {
                double sum = map.get(name) + value;
                map.put(name, sum);
            } else {
                map.put(name, value);
            }
        }
        fbr.close();
        SortedSet<String> keys = new TreeSet<>(map.keySet());
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
