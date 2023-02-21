package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Th1 tr1 = new Th1();
        threads.add(tr1);
        Th2 tr2 = new Th2();
        threads.add(tr2);
        Th3 tr3 = new Th3();
        threads.add(tr3);
        Th4 tr4 = new Th4();
        threads.add(tr4);
        Th5 tr5 = new Th5();
        threads.add(tr5);
    }

    public static void main(String[] args) {
        for (Thread tread : threads){
            tread.start();
        }
    }

    public static class Th1 extends Thread {

        @Override
        public void run() {
            do {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }while (true);
        }
    }

    public static class Th2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Th3 extends Thread {

        @Override
        public void run() {
            do {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }while(true);
        }
    }

    public static class Th4 extends Thread implements Message {

        @Override
        public void run() {
            do {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    showWarning();
                }
            }while(true);
        }

        @Override
        public void showWarning() {
            if (isAlive()) interrupt();
        }
    }

    public static class Th5 extends Thread {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> listNums = new ArrayList<>();

        @Override
        public void run() {
            do {
                try {
                    String line = br.readLine();
                    if (line.equals("N")) {
                        int sum = 0;
                        for (int i = 0; i < listNums.size(); i++) {
                            sum += listNums.get(i);
                        }
                        System.out.println(sum);
                        interrupt();
                    } else {
                        listNums.add(Integer.parseInt(line));
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } while (true);
        }
    }
}