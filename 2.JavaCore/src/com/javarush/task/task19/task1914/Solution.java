package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
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
        String[] textAr = text.split(" ");
        System.setOut(console);

        int result = 0;
        int oper1 = Integer.parseInt(textAr[0]);
        int oper2 = Integer.parseInt(textAr[2]);
        switch (textAr[1]) {
            case "-":
                result = oper1 - oper2;
                break;
            case "+":
                result = oper1 + oper2;
                break;
            case "*":
                result = oper1 * oper2;
                break;
        }

        System.out.println(text + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

