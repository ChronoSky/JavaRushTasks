package com.javarush.task.task14.task1419;

import java.beans.ExceptionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        //2
        exceptions.add(new IllegalArgumentException());


        //3
        try {
            FileInputStream fis = new FileInputStream("111");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        //4
        try {
            int[] num = new int[2];
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        //5
        try {
            Object o = null;
            o.toString();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        //6
        exceptions.add(new ClassNotFoundException());

        //7
        exceptions.add(new EOFException());

        //8
        exceptions.add(new ArrayStoreException());

        //9
        exceptions.add(new RuntimeException());


        //10
        exceptions.add(new NumberFormatException());

    }
}
