package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("123");
        list.add("1234");
        list.add("12345");

        System.out.println(list.size());

        for (String s : list){
            System.out.println(s);
        }
    }
}
