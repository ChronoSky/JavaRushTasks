package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    private Solution() {
    }

    Solution(String s) {
        System.out.println(s);
    }

    protected Solution(String s, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }

    public Solution(int i, String s) {
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }
}


//        Создай 4 конструктора с разными модификаторами доступа в классе Solution.
//        В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
//        Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
//        Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).
