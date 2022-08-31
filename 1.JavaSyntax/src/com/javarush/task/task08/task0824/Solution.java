package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Сын 1" , true, 10);
        Human child2 = new Human("Сын 2" , true, 12);
        Human child3 = new Human("Дочь 1" , false, 14);
        ArrayList<Human> childrens = new ArrayList<>();
        childrens.add(child1);
        childrens.add(child2);
        childrens.add(child3);
        Human mother = new Human("Мать", false, 40, childrens);
        Human father = new Human("Отец", true, 40, childrens);
        ArrayList<Human> childrens1 = new ArrayList<>();
        childrens1.add(mother);
        ArrayList<Human> childrens2 = new ArrayList<>();
        childrens2.add(father);
        Human gf1 = new Human("Дедушка 1", true, 60, childrens1);
        Human gf2 = new Human("Дедушка 2", true, 60, childrens2);
        Human gm1 = new Human("Бабушка 1", false, 55, childrens1);
        Human gm2 = new Human("Бабушка 2", false, 55, childrens2);

        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            children = new ArrayList<>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
