package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        String result = "";
        if (params.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> pair : params.entrySet()) {
                if (pair.getValue() != null) {
                    sb.append(pair.getKey()).append(" = '").append(pair.getValue()).append("'").append(" and ");
                }
            }
            int lindex = sb.lastIndexOf(" and ");
            if (lindex>0) result = sb.replace(lindex, lindex + 5, "").toString();
        }

        return result;
    }
}
