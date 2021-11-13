package com.javarush.task.task03.task0318;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        String number = is.readLine();
        String name = is.readLine();
        is.close();

        System.out.print(name+ " захватит мир через " + number + " лет. Му-ха-ха!");
    }
}
