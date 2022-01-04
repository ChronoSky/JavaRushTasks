package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String text = br.readLine();
            if (text.equals("сумма")) break;
            sum += Integer.parseInt(text);
        }
        System.out.println(sum);
    }
}
