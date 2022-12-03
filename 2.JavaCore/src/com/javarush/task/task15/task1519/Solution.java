package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        String line;

        while (true){
            line = scanner.nextLine();
            if (line.equals("exit")) {break;}

            if (line.contains(".")){
                try{
                    Double d = Double.valueOf(line);
                    print(d);
                }catch (Exception e){
                    print(line);
                }
            }else if (line.matches("[-]?\\d+")){
                try{
                    int i = Integer.parseInt(line);
                    if (i>0 && i<128){
                        print(Short.parseShort(line));
                    }else{
                        print(i);
                    }
                }catch (Exception e){
                    print(line);
                }
            }else {
                print(line);
            }
        }
        scanner.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
