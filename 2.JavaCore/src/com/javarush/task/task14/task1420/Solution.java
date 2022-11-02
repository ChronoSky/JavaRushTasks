package com.javarush.task.task14.task1420;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        if (num1 == num2){
            System.out.println(num1);
        }else{
            int nod = 1;
            for (int i = 2; i <= Math.min(num1, num2); i++) {
                if (num1%i==0 && num2%i==0){
                    nod = i;
                }
            }
            System.out.println(nod);
        }


    }
}
