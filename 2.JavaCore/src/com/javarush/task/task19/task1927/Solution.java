package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        // сохраняем в переменную старый объект System.out
        PrintStream console = System.out;

        // создаем новый объект
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);
        // подменяет out
        System.setOut(myStream);

        // выполняем отправку-перехват сообщений
        testString.printSomething();
        System.setOut(console);

        String[] myString = outputStream.toString().split("\n");
        for (int i = 0; i < myString.length; i++) {
            System.out.println(myString[i]);
            if (i%2!=0){
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
