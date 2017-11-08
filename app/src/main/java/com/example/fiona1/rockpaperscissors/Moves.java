package com.example.fiona1.rockpaperscissors;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Fiona1 on 08/11/2017.
 */

public enum Moves {

    ROCK("Rock", "Scissors", "Lizard"),
    PAPER("Paper", "Rock", "Spock"),
    SCISSORS("Scissors", "Paper", "Lizard"),
    LIZARD("Lizard", "Paper", "Spock"),
    SPOCK("Spock", "Rock", "Scissors");

    private String moveName;
    private String moveWin1;
    private String moveWin2;

    Moves(String moveName, String moveWin1, String moveWin2) {
        this.moveName = moveName;
        this.moveWin1 = moveWin1;
        this.moveWin2 = moveWin2;
    }

    public String getMoveName() {
        return moveName;
    }

    public String getMoveWin1() {
        return moveWin1;
    }

    public String getMoveWin2() {
        return moveWin2;
    }

}
