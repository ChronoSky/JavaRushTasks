package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String y = br.readLine();
        String m = br.readLine();
        String d = br.readLine();

        System.out.println("Меня зовут "+ name +".");
        System.out.println("Я родился "+ d +"." + m + "."+ y);
    }
}
