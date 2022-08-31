package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Фамилия1","Имя1");
        map.put("Фамилия2","Имя1");
        map.put("Фамилия3","Имя3");
        map.put("Фамилия5","Имя4");
        map.put("Фамилия5","Имя5");
        map.put("Фамилия6","Имя6");
        map.put("Фамилия7","Имя7");
        map.put("Фамилия7","Имя8");
        map.put("Фамилия9","Имя9");
        map.put("Фамилия10","Имя9");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
