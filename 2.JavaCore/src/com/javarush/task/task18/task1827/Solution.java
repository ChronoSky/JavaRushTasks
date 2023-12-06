package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    FileReader fr = new FileReader(fileName);
                    BufferedReader fbr = new BufferedReader(fr);
                    int max_id = 0;
                    StringBuilder sb = new StringBuilder();
                    while (fbr.ready()) {
                        String line = fbr.readLine();
                        int id = Integer.parseInt(line.substring(0, 8).trim());
                        String item = line.substring(8, 38);
                        String price = line.substring(38, 46);
                        String count = line.substring(46, 49);
                        if (max_id < id) max_id = id;
                        sb.append(addSimbols(String.valueOf(id),8)).append(item).append(price).append(count).append("\n");
                    }
                    fbr.close();
                    fr.close();
                    if (max_id + 1 > 99999999) break;
                    if (args[1].length() > 30) break;
                    if (args[2].length() > 8) break;
                    if (args[3].length() > 4) break;
                    sb.append(addSimbols(String.valueOf(max_id + 1),8))
                        .append(addSimbols(args[1], 30))
                        .append(addSimbols(args[2], 8))
                        .append(addSimbols(args[3], 4));

                    FileWriter fw = new FileWriter(fileName);
                    fw.write(sb.toString());
                    fw.close();
                    break;
            }
        }
    }

    public static String addSimbols(String text, int maxLength) {
        if (text.length() < maxLength) {
            return String.format("%1$-" + maxLength + "s", text);
        }
        return text;
    }
}
