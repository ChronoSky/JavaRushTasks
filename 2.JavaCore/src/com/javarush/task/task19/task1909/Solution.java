package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = br.readLine();
        String filename2 = br.readLine();
        br.close();

        String line;
        try(BufferedReader brf = new BufferedReader(new FileReader(filename1))){
            try(BufferedWriter bfw = new BufferedWriter(new FileWriter(filename2))){
                while ((line = brf.readLine())!=null){
                    bfw.write(line.replace(".","!"));
                    bfw.flush();
                }
            }
        }catch(Exception e ){
        }

    }
}
