package com.javarush.task.task18.task1828;

import java.io.*;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        if (args.length > 0) {

            FileReader fr = new FileReader(fileName);
            BufferedReader fbr = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();

            int expId = Integer.parseInt(args[1]);

            if (args[1].length() > 8) return;

            switch (args[0]) {
                case "-d":
                    while (fbr.ready()) {
                        String line = fbr.readLine();
                        int id = Integer.parseInt(line.substring(0, 8).trim());
                        String item = line.substring(8, 38);
                        String price = line.substring(38, 46);
                        String count = line.substring(46, 49);
                        if (id != expId)
                            sb.append(addSimbols(String.valueOf(id), 8)).append(item).append(price).append(count).append("\n");
                    }
                    break;
                case "-u":
                    if (args[2].length() > 30) return;
                    if (args[3].length() > 8) return;
                    if (args[4].length() > 4) return;
                    while (fbr.ready()) {
                        String line = fbr.readLine();
                        int id = Integer.parseInt(line.substring(0, 8).trim());
                        String item = line.substring(8, 38);
                        String price = line.substring(38, 46);
                        String count = line.substring(46, 49);
                        if (id == expId){
                            sb.append(addSimbols(String.valueOf(expId), 8))
                                    .append(addSimbols(args[2], 30))
                                    .append(addSimbols(args[3], 8))
                                    .append(addSimbols(args[4], 4)).append("\n");
                        }else{
                            sb.append(addSimbols(String.valueOf(id), 8)).append(item).append(price).append(count).append("\n");
                        }
                    }
                    break;
            }

            fbr.close();
            fr.close();

            FileWriter fw = new FileWriter(fileName);
            fw.write(sb.toString());
            fw.close();


        }
    }

    public static String addSimbols(String text, int maxLength) {
        if (text.length() < maxLength) {
            return String.format("%1$-" + maxLength + "s", text);
        }
        return text;
    }


}
