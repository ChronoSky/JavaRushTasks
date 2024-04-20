package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        PrintWriter printWriter = new PrintWriter(outputStream);
        for (Map.Entry<String, String> entry : runtimeStorage.entrySet()) {
            String line = String.format("%s = %s", entry.getKey().replace(" ", "\\ "), entry.getValue());
            printWriter.println(line);
        }
        printWriter.close();

    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        Properties properties = new Properties();
        properties.load(inputStream);
        Map step1 = properties;
        Map<String, String> step2 = (Map<String, String>)step1;
        runtimeStorage = new HashMap<>(step2);
    }

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
