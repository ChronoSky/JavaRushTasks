package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int num = Integer.parseInt(br.readLine());
        int i=0;
        while (i<num){
            System.out.println(text);
            i++;
        }
    }
}
