package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String name2;
        private String name3;
        private int age;
        private Date birthdate;
        private String address;

        public Human(String name, String name2, String name3) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
        }

        public Human(String name, String name2, String name3, int age) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
            this.age = age;
        }

        public Human(String name, String name2, String name3, int age, Date birthdate) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
            this.age = age;
            this.birthdate = birthdate;
        }

        public Human(String name, String name2, String name3, int age, Date birthdate, String address) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
            this.age = age;
            this.birthdate = birthdate;
            this.address = address;
        }

        public Human(String name, String name2, String name3, Date birthdate) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
            this.birthdate = birthdate;
        }

        public Human(String name, String name2, String name3, String address) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
            this.address = address;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, Date birthdate) {
            this.name = name;
            this.birthdate = birthdate;
        }

        public Human(String name, String address) {
            this.name = name;
            this.address = address;
        }


        public Human(String name, String name2, String name3, int age, String address) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
            this.age = age;
            this.address = address;
        }
    }
}
