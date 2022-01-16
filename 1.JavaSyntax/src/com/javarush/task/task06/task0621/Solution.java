package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String grFatherName = reader.readLine();
        Cat catGrFather = new Cat(grFatherName);

        String grMotherName = reader.readLine();
        Cat catGrMother = new Cat(grMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrFather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catGrFather);
        System.out.println(catGrMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentFather;
        private Cat parentMother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString() {
            String text = "The cat's name is " + name;

            if (parentMother == null){
                text += ", no mother,";
            }else {
                text += ", mother is "+ this.parentMother.name +",";
            }

            if (parentFather == null){
                text += " no father,";
            }else {
                text += " father is "+ this.parentFather.name;
            }

            return text;
        }
    }

}
