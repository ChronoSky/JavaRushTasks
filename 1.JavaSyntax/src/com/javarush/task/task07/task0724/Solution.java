package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human gradfather1 = new Human("GradFather1", true, 55);
        Human gradmother1 = new Human("GradMother1", false, 55);
        Human gradfather2 = new Human("GradFather2", true, 55);
        Human gradmother2 = new Human("GradMother2", false, 55);
        Human father = new Human("Father", true, 35, gradfather1 , gradmother1);
        Human mother = new Human("Mother", false, 35, gradfather2, gradmother2);
        Human son = new Human("Son", true, 15, father, mother);
        Human douther = new Human("Douther", false, 12, father, mother);
        Human douther1 = new Human("Douther", false, 11, father, mother);

        System.out.println(gradfather1);
        System.out.println(gradmother1);
        System.out.println(gradfather2);
        System.out.println(gradmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(douther);
        System.out.println(douther1);

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}