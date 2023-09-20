package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        String fileName1;
        String fileName2;
        FileInputStream fis1;
        FileInputStream fis2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            fileName1 = br.readLine();
            BufferedReader br1 = new BufferedReader(new FileReader(fileName1));
            while (br1.ready()) {
                allLines.add(br1.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            fileName2 = br.readLine();
            BufferedReader br2 = new BufferedReader(new FileReader(fileName2));

            while (br2.ready()) {
                forRemoveLines.add(br2.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
