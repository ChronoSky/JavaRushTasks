package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        List<String> file1List = readFileLines(file1);
        List<String> file2List = readFileLines(file2);


        LineItem lineItem;
        int j = 0;
        int i = 0;

        while (!(file1List.size() == i && file2List.size() == j)) {

            // Если во втором файле больше строк чем в первом
            if (file2List.size() != j && file1List.size()==i) {
                lineItem = new LineItem(Type.ADDED, file2List.get(j));
                lines.add(lineItem);

                j++;
                continue;
            }
            // Если в первом файле больше строк чем во втором
            if (file1List.size() != i && file2List.size()==j) {
                lineItem = new LineItem(Type.REMOVED, file1List.get(i));
                lines.add(lineItem);
                i++;
                continue;
            }
            if (file1List.get(i).equals(file2List.get(j))) {
                lineItem = new LineItem(Type.SAME, file1List.get(i));
                lines.add(lineItem);
                j++;
            } else {
                if (file1List.get(i).equals(file2List.get(j + 1))) {
                    lineItem = new LineItem(Type.ADDED, file2List.get(j));
                    lines.add(lineItem);
                    lineItem = new LineItem(Type.SAME, file2List.get(j + 1));
                    lines.add(lineItem);
                    j++;
                    j++;
                } else {
                    lineItem = new LineItem(Type.REMOVED, file1List.get(i));
                    lines.add(lineItem);
                }
            }
            i++;
        }

    }

    public static List<String> readFileLines(String fileName) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
