package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while(true){
            String line = br.readLine();
            if (line.equals("end")) break;
            list.add(line);
        }

        br.close();

        String wFileName = list.get(0).split(".part")[0];
        Collections.sort(list);

        byte[] buffer;
        File file = new File(wFileName);
        FileOutputStream fos = new FileOutputStream(file);
        int lastByte = 0;
        for (String s : list) {
            FileInputStream fis = new FileInputStream(s);
            buffer = new byte[fis.available()];
            fis.read(buffer);
            fos.write(buffer, 0, buffer.length);
            lastByte += buffer.length;
            fis.close();
        }

        fos.close();


    }
}
