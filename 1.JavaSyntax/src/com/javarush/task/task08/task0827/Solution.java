package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 1 2022"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(simpleDateFormat.parse(date));
        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;

    }
}
