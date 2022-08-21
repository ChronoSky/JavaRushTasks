package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя3");
        map.put("Фамилия4", "Имя1");
        map.put("Фамилия5", "Имя2");
        map.put("Фамилия6", "Имя3");
        map.put("Фамилия7", "Имя1");
        map.put("Фамилия8", "Имя2");
        map.put("Фамилия9", "Имя3");
        map.put("Фамилия10", "Имя4");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, Integer> dublmap = new HashMap<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (!dublmap.containsKey(pair.getValue())) {
                dublmap.put(pair.getValue(), 1);
            }else{
                dublmap.put(pair.getValue(), dublmap.get(pair.getValue()) + 1);
            }
        }

        for (Map.Entry<String, Integer> pair : dublmap.entrySet()) {
            if (pair.getValue()>1){
                removeItemFromMapByValue(map, pair.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    
    }
}
