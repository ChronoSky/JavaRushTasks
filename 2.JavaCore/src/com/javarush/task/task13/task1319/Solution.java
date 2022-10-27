package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        List<String> list = new ArrayList<>();
        do {
            String line = br.readLine();
            list.add(line);
            if (line.equals("exit")) break;
        }while(true);

        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for (String s : list){
            bw.write(s);
            bw.write("\n");
        }

        br.close();
        fos.close();
        bw.close();
    }
}
