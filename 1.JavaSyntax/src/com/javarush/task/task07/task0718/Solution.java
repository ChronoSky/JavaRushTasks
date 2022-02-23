package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add( br.readLine());
        }

        int max = 0;
        int maxindex = -1;
        for (int i = 0; i < 10; i++) {
            if (max > list.get(i).length()) {
                maxindex = i;
                System.out.println(maxindex);
                break;
            }else {
                max = list.get(i).length();
            }
        }




    }
}

