package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        String name;
        Sex s;
        Date bd;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        String method = args[0];
        switch (method) {
            case "-c":
                name = args[1];
                bd = sdf.parse(args[3]);
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(name, bd));
                    System.out.println(allPeople.size() - 1);
                } else if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(name, bd));
                    System.out.println(allPeople.size() - 1);
                } else {
                    break;
                }
                break;
            case "-r":
                //  выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990) -r id
                Person p = allPeople.get(Integer.parseInt(args[1]));
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
                String bd2 = sdf2.format(p.getBirthDate());
                System.out.println(String.format("%s %s %s", p.getName(), p.getSex() == Sex.MALE ? "м" : "ж", bd2));
                break;

            case "-u":
                int id = Integer.parseInt(args[1]);
                Person p2 = allPeople.get(id);
                p2.setName(args[2]);
                p2.setSex(args[3].equals("м")?Sex.MALE : Sex.FEMALE);
                p2.setBirthDate(sdf.parse(args[4]));
                break;
            case "-d":
                Person p3 = allPeople.get(Integer.parseInt(args[1]));
                p3.setName(null);
                p3.setSex(null);
                p3.setBirthDate(null);
                break;

        }

    }
}
