package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<Integer, String> map = new HashMap<>();

    static {
        for (int i = 0; i < 256; i++) {
            String s = string8(Integer.toBinaryString(i & 0xFF));
            map.put(i,s);
        }
    }

    public static String string8(String value){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8-value.length(); i++) {
            sb.append("0");
        }
        sb.append(value);
        return sb.toString();
    }


    public static void main(String[] args) {


        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[4];
        for (int i = 0; i < ip.length; i++) {
            int a = ip[i];
            if (ip[i]<0) a += 256;
            int b = mask[i];
            if (mask[i]<0) b += 256;
            int bin = a & b;
            netAddress[i] = (byte)bin;
        }
        return netAddress;
    }

    public static void print(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            int num=b;
            if (b<0) num+=256;
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
