package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{

        String result = "";

        @Override
        public void run() {
            int lineCount = 3;
            StringBuilder lines = new StringBuilder();
            while(lineCount>0){
                try {
                    lines.append(reader.readLine());
                    if (lineCount!=1){
                        lines.append(" ");
                    }
                    lineCount--;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            result = lines.toString();
        }


        public void printResult() {
            System.out.println(result);
        }
    }
}
