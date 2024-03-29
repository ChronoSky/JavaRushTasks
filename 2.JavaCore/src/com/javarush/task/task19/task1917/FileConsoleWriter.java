package com.javarush.task.task19.task1917;

import java.io.*;

/* 
Свой FileWriter
*/

public class FileConsoleWriter {

    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) throws IOException {
        this.fileWriter = new FileWriter(fd);
    }


    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(char[] cbuf, int off, int len) throws IOException{
        if ((off+len) > cbuf.length)
            len = cbuf.length-off;
        fileWriter.write(cbuf,off,len);
        System.out.println(String.valueOf(cbuf).substring(off,off+len));
    }

    public void write(String str, int off, int len) throws IOException{
        if ((off+len) > str.length())
            len = str.length()-off;
        fileWriter.write(str,off,len);
        System.out.println(str.substring(off,off+len));
    }

    public void write(char[] cbuf) throws IOException{
        fileWriter.write(cbuf);
        System.out.println(String.valueOf(cbuf));
    }

    public void close() throws IOException{
        fileWriter.close();
    }


    public static void main(String[] args) {

    }

}
