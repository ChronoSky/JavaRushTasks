package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;
        private final SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {

            while(fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                String[] list =  line.split(" ");
                String lastname = list[0];
                String firstname = list[1];
                String midlename = list[2];
                String day = list[3];
                String month = list[4];
                String year = list[5];

                return new Person(firstname, midlename, lastname, sdf.parse(String.format("%s %s %s", day, month, year)));
            }

            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
