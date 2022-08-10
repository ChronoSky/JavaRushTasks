package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Смирнов2", dateFormat.parse("JAN 1 2012"));
        map.put("Смирнов3", dateFormat.parse("FEB 1 2012"));
        map.put("Смирнов4", dateFormat.parse("MAR 1 2012"));
        map.put("Смирнов5", dateFormat.parse("APR 1 2012"));
        map.put("Смирнов6", dateFormat.parse("JUN 1 2012"));
        map.put("Смирнов7", dateFormat.parse("JUL 1 2012"));
        map.put("Смирнов8", dateFormat.parse("AUG 1 2012"));
        map.put("Смирнов9", dateFormat.parse("SEP 1 2012"));
        map.put("Смирнов10", dateFormat.parse("NOV 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if (month>4 && month<8) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}
