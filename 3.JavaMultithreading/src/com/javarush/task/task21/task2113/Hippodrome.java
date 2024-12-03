package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> listHorses = new ArrayList<>();
        listHorses.add(new Horse("name1", 3, 0));
        listHorses.add(new Horse("name2", 3, 0));
        listHorses.add(new Horse("name3", 3, 0));
        game = new Hippodrome(listHorses);
        game.run();
        game.printWinner();
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double max = 0;
        Horse winHorse = horses.get(0);
        for (Horse horse: horses){
            if (horse.getDistance()> max){
                max = horse.getDistance();
                winHorse = horse;
            }
        }
        return winHorse;
    }

    public void printWinner() {
        Horse horse = getWinner();
        System.out.println(String.format("Winner is %s!", horse.getName()));
    }

}
