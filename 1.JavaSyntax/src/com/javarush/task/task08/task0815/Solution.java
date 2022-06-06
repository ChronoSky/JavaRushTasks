package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия1","Имя");
            map.put("Фамилия2","Имя2");
            map.put("Фамилия3","Имя2");
            map.put("Фамилия4","Имя2");
            map.put("Фамилия5","Имя");
            map.put("Фамилия6","Имя3");
            map.put("Фамилия7","Имя7");
            map.put("Фамилия8","Имя5");
            map.put("Фамилия9","Имя8");
            map.put("Фамилия0","Имя");
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        Set<String> setFN = new HashSet<String>();
        int count = 0;
        for (String fn: map.values()){
            if (name.equals(fn)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        Set<String> setFN = new HashSet<String>();
        int count = 0;
        for (String ln: map.keySet()){
            if (lastName.equals(ln)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        createMap();
    }
}
