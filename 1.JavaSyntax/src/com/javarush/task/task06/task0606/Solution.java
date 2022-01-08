package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();
        int len = numStr.length();
        int num = Integer.parseInt(numStr);

        if (num>0) {
            while (true){
                if (num%2==0){
                    even++;
                }else{
                    odd++;
                }
                num = num/10;
                if (num<1) break;
            }
            System.out.println("Even: "+ even +" Odd: "+ odd);
        }

    }
}
