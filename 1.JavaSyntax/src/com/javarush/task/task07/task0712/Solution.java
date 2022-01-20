package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        String l = "";
        String sh = "";
        int minInd = 0;
        int maxInd = 0;
        for  (int i = 0; i < 10; i++) {
            String s = list.get(i);
            if (i ==0){
                l = s;
                sh = s;
                maxInd = i;
                minInd=i;
            }else{
                if (l.length() < s.length() ){ l=s; maxInd = i;}
                if (sh.length() > s.length() ){ sh=s; minInd=i;}
            }
        }

        if (maxInd > minInd){
            System.out.println(sh);
        }        else{
            System.out.println(l);
        }

    }
}
