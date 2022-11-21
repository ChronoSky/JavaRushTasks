package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0,"1.0");
        labels.put(2.5,"2.5");
        labels.put(3.3,"3.3");
        labels.put(4.7,"4.7");
        labels.put(6.9,"6.9");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
