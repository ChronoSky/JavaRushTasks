package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] nums = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (i%2==0){
                sum1+= nums[i];
            }else {
                sum2+= nums[i];
            }
        }

        if (sum1>sum2){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else if (sum1<sum2){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
