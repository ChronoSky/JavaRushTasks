package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

        try {
            if (string == null || string.equals("")) throw new TooShortStringException();
            int indexFirstTab = string.indexOf("\t");
            int indexLastTab = string.lastIndexOf("\t");
            int indexSecondTab = string.substring(indexFirstTab + 1).indexOf("\t");
            if (indexFirstTab == indexFirstTab + indexSecondTab || indexFirstTab==indexLastTab) {
                throw new TooShortStringException();
            }
            return string.substring(indexFirstTab + 1, indexFirstTab + indexSecondTab+1);
        } catch (IndexOutOfBoundsException e) {
            throw new TooShortStringException();
        }

    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
