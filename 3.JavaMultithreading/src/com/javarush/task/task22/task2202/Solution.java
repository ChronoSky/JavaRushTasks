package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

        try {
            if (string == null || string.equals("")) throw new TooShortStringException();
            int firstIndex = string.indexOf(" ");
            String[] sub = string.substring(firstIndex+1).split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append(sub[i]).append(" ");
            }
            return sb.toString().trim();
        } catch (IndexOutOfBoundsException e) {
            throw new TooShortStringException();
        }

    }

    public static class TooShortStringException extends RuntimeException {
    }
}
