package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream fis = new FileInputStream(filename);
        Map<Integer, Integer> map = new HashMap<>();
        int i = fis.read();
        int max = 1;
        map.put(i, 1);
        while (fis.available() > 0) {
            i = fis.read();
            if (map.containsKey(i)) {
                int count = map.get(i) + 1;
                map.put(i, count);
                if (max < count) max = count;
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if (pair.getValue()==max){
                System.out.print(pair.getKey());
                System.out.print(" ");
            }
        }
        fis.close();
    }
}
