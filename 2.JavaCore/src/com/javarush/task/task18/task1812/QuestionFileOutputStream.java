package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    AmigoOutputStream steam;

    public QuestionFileOutputStream(AmigoOutputStream steam) {
        this.steam = steam;
    }

    @Override
    public void flush() throws IOException {
        steam.flush();
    }

    @Override
    public void write(int b) throws IOException {
        steam.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        steam.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        steam.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (br.readLine().equals("Д")){steam.close();}
    }
}

