package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private final static int SIDE = 9;

    public void initialize(){
        setScreenSize(SIDE, SIDE);
    }

}
