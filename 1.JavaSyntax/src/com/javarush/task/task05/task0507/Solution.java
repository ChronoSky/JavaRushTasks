package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int num;
        int sum = 0;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            num = Integer.parseInt(br.readLine());
            if (num == -1) break;
            count++;
            sum += num;
        }
        System.out.println((float)sum/count);
    }
}

