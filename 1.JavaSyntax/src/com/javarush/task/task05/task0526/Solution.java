package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("man1", 10 , "qwerty");
        System.out.println(man.name + " " + man.age + " " + man.address );
        Man man2 = new Man("man2", 11 , "qwerty2");
        System.out.println(man2.name + " " + man2.age + " " + man2.address );


        Woman woman = new Woman("Woman", 14, "asdfg");
        System.out.println(woman.name + " " + woman.age + " " + woman.address );
        Woman woman2 = new Woman("Woman2", 16, "asdfg2");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address );
    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
