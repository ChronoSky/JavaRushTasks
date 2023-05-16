package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код
    static {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //напишите тут ваш код
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private ArrayList<String> list = new ArrayList<>();
        private String fileName;

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i!=0) result.append(" ");
                result.append(list.get(i));
            }
            return result.toString();
        }

        @Override
        public void run() {
            try(FileInputStream fis = new FileInputStream(fileName);){
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                while(br.ready()){
                    list.add(br.readLine());
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
