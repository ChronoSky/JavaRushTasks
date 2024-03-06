package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {

        String filename = args[0]; // "C:\\Java\\Test.txt"; //
        try (BufferedReader fbr = new BufferedReader(new FileReader(filename))) {
            while(fbr.ready()){
                String strLine = fbr.readLine();
                String[] line = strLine.split(" ");
                if (line.length == 6) {
                    String day = line[3].trim();
                    String month = line[4].trim();
                    String year = line[5].trim();
                    String name = strLine.replace(day + " " + month + " " + year, "").trim();

                    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
                    String dateString = String.format("%s.%s.%s", day, month, year);
                    Date date = formatter.parse(dateString);
                    PEOPLE.add(new Person(name, date));
                } else if (line.length == 4) {

                    String day = line[1].trim();
                    String month = line[2].trim();
                    String year = line[3].trim();
                    String name = strLine.replace(day + " " + month + " " + year, "").trim();

                    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
                    String dateString = String.format("%s.%s.%s", day, month, year);
                    Date date = formatter.parse(dateString);
                    PEOPLE.add(new Person(name, date));
                }
            }

        } catch (IOException | ParseException ioException) {
            ioException.printStackTrace();
        }
//         System.out.println("!!!");

    }
}
