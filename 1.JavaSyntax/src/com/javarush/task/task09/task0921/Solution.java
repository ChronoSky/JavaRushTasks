package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData()  {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            do{
                String text = br.readLine();
                if (text.matches("\\d+")){

                    list.add(Integer.parseInt(text));
                }else{
                    for (int i : list){
                        System.out.println(i);
                    }
                    break;
                }

            }while(true);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
