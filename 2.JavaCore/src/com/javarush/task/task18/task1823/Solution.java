package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (line.equals("exit")) break;
            new ReadThread(line);
        }


    }

    public static class ReadThread extends Thread {

        FileInputStream fis;
        private Map<Integer, Integer> map = new HashMap<>();
        private String fileName;
        private int max = 0;

        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            fis = new FileInputStream(fileName);
            this.fileName = fileName;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    if (fis.available() > 0) {
                        int b = fis.read();
                        if (map.containsKey(b)) {
                            int count = map.get(b);
                            map.put(b, count + 1);
                        } else {
                            map.put(b, 1);
                        }
                    } else {
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            int maxcount = 0;

            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (pair.getValue() > maxcount) maxcount = pair.getValue();
            }

            int bcount = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (pair.getValue() == maxcount) {
                    if (pair.getKey()<bcount) bcount = pair.getKey();
                }
            }
            synchronized (resultMap){
                resultMap.put(fileName, bcount);
            }

            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // implement file reading here - реализуйте чтение из файла тут

    }
}
