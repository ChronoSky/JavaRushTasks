package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String pattern = "\\?(.*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(url);
        while (m.find()) {
            String paramString = m.group(1);
            String[] params = paramString.split("&");
            Map<String, String> map = new HashMap<>();
            for (int i = 0; i < params.length; i++) {
                String paramName = params[i].split("=")[0];
                String paramValue = "";
                if (params[i].contains("=")){
                    paramValue = params[i].split("=")[1];
                }
                map.put(paramName, paramValue);
                if (i == 0) {
                    System.out.print(paramName);
                } else {
                    System.out.print(" " + paramName);
                }

            }

            if (map.containsKey("obj")) {
                System.out.println();
                try {
                    alert(Double.parseDouble(map.get("obj")));
                } catch (Exception e) {
                    alert(map.get("obj"));
                }

            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
