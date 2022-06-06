package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set set = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            set.add("Л"+i);
        }
        return set;
    }

    public static void main(String[] args) {

    }
}

//    Создать множество строк (Set&lt;String&gt;), занести в него 20 слов на букву &laquo;Л&raquo;.
//
//
//        Требования:
//        1.	Не изменяй заголовок метода createSet().
//        2.	Программа не должна выводить текст на экран.
//        3.	Программа не должна считывать значения с клавиатуры.
//        4.	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
//        5.	Множество из метода createSet() должно содержать 20 слов на букву &laquo;Л&raquo;.