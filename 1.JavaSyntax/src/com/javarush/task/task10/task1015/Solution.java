package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[2];
        ArrayList<String> elem1 = new ArrayList<>();
        elem1.add("Сторкак 1");
        elem1.add("Сторкак 12");
        list[0] = elem1;
        ArrayList<String> elem2 = new ArrayList<>();
        elem2.add("Сторкак 13");
        elem2.add("Сторкак 14");
        list[1] = elem2;

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}