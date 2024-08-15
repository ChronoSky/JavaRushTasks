package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static List<String> list;
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };


        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (list.contains(String.format("%s%s", i, j))) {
                    continue;
                }
                // i строка , j столбец
                if (a[i][j] == 1) {
                    int weight = getWieght(i, j, a);
                    int height = getHeight(i, j, a);
                    addToList(i, j, weight, height, a);
                    count++;
                    j = j + weight - 1;
                }

            }

        }
        return count;
    }

    public static int getHeight(int x, int y, byte[][] a) {
        int result = 0;
        for (int i = x; i < a.length; i++) {
            if (a[i][y] == 1) result++;
        }
        return result;
    }

    public static int getWieght(int x, int y, byte[][] a) {
        int result = 0;
        for (int i = y; i < a.length; i++) {
            if (a[x][i] == 1) result++;
        }
        return result;
    }

    public static void addToList(int x, int y, int w, int h, byte[][] a) {
        for (int i = x; i < x+h; i++) {
            for (int j = y; j <y+w ; j++) {
                list.add(String.format("%s%s", i, j));
            }
        }
    }
}
