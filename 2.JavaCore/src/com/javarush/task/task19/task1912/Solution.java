package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.SQLOutput;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream console = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);

        System.setOut(myStream);
        testString.printSomething();

        String text = outputStream.toString();
        System.setOut(console);

        System.out.println(text.replace("te", "??"));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
