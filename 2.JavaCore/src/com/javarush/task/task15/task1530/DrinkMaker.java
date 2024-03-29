package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {

    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    public void makeDrink(){
        //выбирает чашку, кладет ингредиенты, заливает жидкость.
        getRightCup();
        putIngredient();
        pour();
    }

}
