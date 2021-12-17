package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int count1 =0;
        int count2 =0;
        if (this.age > anotherCat.age) {
            count1++;
        }else if (this.age < anotherCat.age){
            count2++;
        }
        if (this.weight > anotherCat.weight) {
            count1++;
        }else if (this.weight < anotherCat.weight){
            count2++;
        }
        if (this.strength > anotherCat.strength) {
            count1++;
        }else if (this.strength < anotherCat.strength){
            count2++;
        }

        if (count1>count2)return true;
        return false;
    }

    public static void main(String[] args) {

    }
}
