package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(br.readLine());

        if (num < 0){
            if (num%2==0){
                System.out.println("отрицательное четное число");
            }else{
                System.out.println("отрицательное нечетное число");
            }
        }else if(num > 0){
            if (num%2==0){
                System.out.println("положительное четное число");
            }else{
                System.out.println("положительное нечетное число");
            }
        }else {
            System.out.println("ноль");
        }

    }
}
