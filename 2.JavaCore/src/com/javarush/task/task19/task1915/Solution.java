package com.javarush.task.task19.task1915;

import java.io.*;


/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        br.close();

        PrintStream console = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);

        System.setOut(myStream);
        testString.printSomething();

        String text = outputStream.toString();

        System.setOut(console);
        System.out.println(text);
        FileOutputStream fos = new FileOutputStream(filename);
        fos.write(text.getBytes());
        fos.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

