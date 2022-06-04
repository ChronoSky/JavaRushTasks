package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            nums.add(num);
        }

        int gmax = 1;
        int max = 1;
        int value = nums.get(0);
        for (int i = 1; i < 10; i++) {
            if (value == nums.get(i)){
                max++;
                if (gmax < max)  gmax = max;
            }else{
                value = nums.get(i);
                max = 1;
            }
        }

        System.out.println(gmax);
    }
}
