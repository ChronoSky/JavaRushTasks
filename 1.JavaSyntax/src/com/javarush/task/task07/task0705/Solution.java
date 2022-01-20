package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] nums = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for (int i = 0; i < nums.length; i++) {
            if (i<10){
                nums1[i] = nums[i];
            }else{
                nums2[i-10] = nums[i];
            }
        }

        for (int i : nums2){
            System.out.println(i);
        }
    }
}
