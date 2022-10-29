package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        try{
            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader br2 = new BufferedReader(new InputStreamReader(fis));

            ArrayList<Integer> list = new ArrayList<>();
            while(br2.ready()){
                int num = Integer.parseInt(br2.readLine());
                if (num%2==0){
                    list.add(num);
                }
            }

            Collections.sort(list);

            for (Integer i : list){
                System.out.println(i);
            }

            br2.close();
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }

        br.close();
    }
}
