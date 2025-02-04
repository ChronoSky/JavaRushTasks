package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber != null) {
            if (telNumber.startsWith("+")) {
                int count = 0;
                if (telNumber.length() == 13 || telNumber.length() == 15) {
                    for (int i = 1; i < telNumber.length(); i++) {
                        if (telNumber.substring(i, i + 1).matches("\\d")) count++;
                    }
                    if (count == 12 && containsSkobka(telNumber) && isPhone(telNumber)) return true;
                }
            }else if (telNumber.matches("(^\\(|\\d).*")) {
                int count = 0;
                for (int i = 0; i < telNumber.length(); i++) {
                    if (telNumber.substring(i, i + 1).matches("\\d")) count++;
                }
                if (count == 10 && containsSkobka(telNumber) && isPhone(telNumber)) return true;
            }
        }
        return false;
    }

    public static boolean containsSkobka(String value) {
        if (!value.matches(".*[()].*")) return true;

        if (value.matches(".*(\\(\\d{3}\\)).*")) {
            return true;
        }
        return false;
    }

    public static boolean isPhone(String value) {
        if (value.matches("[0-9()+]*\\d")) return true;
        return false;
    }


    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("(050)1234567"));
        System.out.println(checkTelNumber("0(501)234567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)123-45-67"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));

    }
}
