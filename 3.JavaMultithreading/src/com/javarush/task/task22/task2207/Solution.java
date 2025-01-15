package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String fileName = reader.readLine();
      //  String fileName = "C:\\Java\\Temp\\Test.txt";
        reader.close();


        BufferedReader bfr = new BufferedReader(new FileReader(fileName));
        List<String> wordList = new ArrayList<>();
        while (bfr.ready()) {
            String[] temp = bfr.readLine().split("\\s");
            wordList.addAll(Arrays.asList(temp));
        }
        bfr.close();


        while (true) {
            if (wordList.size() == 0) break;
            String first = wordList.get(0);
            wordList.remove(0);

            Iterator iterator = wordList.iterator();
            while (iterator.hasNext()) {
                String value = (String) iterator.next();
                String rev = new StringBuilder().append(value).reverse().toString();
                if (first.equals(rev)) {
                    iterator.remove();
                    Pair pair = new Pair();
                    pair.first = first;
                    pair.second = value;
                    result.add(pair);
                    break;
                }
            }
        }

        for (Pair p : result) {
            System.out.println(p.toString());
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
