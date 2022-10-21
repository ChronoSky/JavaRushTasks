package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        //5, 2, 4, 7, 0
        ArrayList<int[]> list = new ArrayList<>();
        int[] ar1 = new int[5];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = (int)Math.random()*100;
        }
        list.add(ar1);
        int[] ar2 = new int[2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = (int)Math.random()*100;
        }
        list.add(ar2);
        int[] ar3 = new int[4];
        for (int i = 0; i < ar3.length; i++) {
            ar3[i] = (int)Math.random()*100;
        }
        list.add(ar3);
        int[] ar4 = new int[7];
        for (int i = 0; i < ar4.length; i++) {
            ar4[i] = (int)Math.random()*100;
        }
        list.add(ar4);
        int[] ar5 = new int[0];
        for (int i = 0; i < ar5.length; i++) {
            ar5[i] = (int)Math.random()*100;
        }
        list.add(ar5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
