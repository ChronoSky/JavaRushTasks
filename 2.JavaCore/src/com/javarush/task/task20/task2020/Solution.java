package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

/* 
Сериализация человека
*/

public class Solution {

    public static class Person implements Serializable{
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }


        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(fullName);
            out.writeObject(greeting);
            out.writeObject(country);
            out.writeObject(sex);
        }


        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            this.firstName = (String) in.readObject();
            this.lastName = (String) in.readObject();
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.country = (String) in.readObject();
            this.sex = (Sex) in.readObject();
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}
