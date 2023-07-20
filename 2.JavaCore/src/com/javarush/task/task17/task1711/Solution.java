package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        String name;
        Sex s;
        Date bd;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);


        switch (args[0]) {
            case "-c":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i = i + 3) {
                        name = args[i];
                        bd = sdf.parse(args[i + 2]);
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(name, bd));
                            System.out.println(allPeople.size() - 1);
                        } else if (args[i + 1].equals("ж")) {
                            allPeople.add(Person.createFemale(name, bd));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                }
                break;

            case "-u":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i = i + 4) {
                        int id = Integer.parseInt(args[i]);
                        Person p2 = allPeople.get(id);
                        p2.setName(args[i + 1]);
                        p2.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                        p2.setBirthDate(sdf.parse(args[i + 3]));
                    }
                }
                break;
            case "-d":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        Person p3 = allPeople.get(Integer.parseInt(args[i]));
                        p3.setName(null);
                        p3.setSex(null);
                        p3.setBirthDate(null);
                    }
                }
                break;
            case "-i":
                //  выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990) -r id
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        Person p = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
                        String bd2 = sdf2.format(p.getBirthDate());
                        System.out.println(String.format("%s %s %s", p.getName(), p.getSex() == Sex.MALE ? "м" : "ж", bd2));
                    }
                }
                break;

        }
    }
}
