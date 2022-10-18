package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        char[] textA = text.toCharArray();
        StringBuilder gl = new StringBuilder();
        StringBuilder sgl = new StringBuilder();
        for (int i = 0; i < textA.length; i++) {
            if (textA[i]==32) continue;
            if (isVowel(textA[i])){
                gl.append(textA[i]).append(" ");
            }else {
                sgl.append(textA[i]).append(" ");
            }
        }
        System.out.println(gl);
        System.out.println(sgl);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}