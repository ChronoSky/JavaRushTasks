package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list_1 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        ArrayList<Integer> list_3 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        for (int i : list) {
            if (i%3==0 || i%2==0){
                if (i%3==0) list_1.add(i);
                if (i%2==0) list_2.add(i);
            }else {
              list_3.add(i);
            }
        }
        printList(list_1);
        printList(list_2);
        printList(list_3);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i: list){
            System.out.println(i);
        }

    }
}
