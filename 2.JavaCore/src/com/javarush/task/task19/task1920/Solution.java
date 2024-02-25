package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader fbr = new BufferedReader(new FileReader(args[0])); //
        Map<String, Double> oldmap = new HashMap<String, Double>();
        double maxsum = 0;
        while (fbr.ready()) {
            String line = fbr.readLine();
            String name = line.split(" ")[0];
            double value = Double.parseDouble(line.split(" ")[1]);
            if (oldmap.containsKey(name)) {
                oldmap.put(name, oldmap.get(name) + value);
            } else {
                oldmap.put(name, value);
            }
            if (oldmap.get(name) > maxsum) maxsum = oldmap.get(name);
        }
        fbr.close();

        Map<String, Double> map = new HashMap<String, Double>();
        for (Map.Entry<String, Double> pair : oldmap.entrySet()){
            if (pair.getValue() == maxsum) map.put(pair.getKey(), pair.getValue());
        }
        SortedSet<String> keys = new TreeSet<>(map.keySet());
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
