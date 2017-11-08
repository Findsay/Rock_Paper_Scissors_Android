package com.example.fiona1.rockpaperscissors;

/**
 * Created by Fiona1 on 08/11/2017.
 */

public enum Moves {

    ROCK("Rock", "Scissors"),
    PAPER("Paper", "Rock"),
    SCISSORS("Scissors", "Paper");

    private String moveName;
    private String moveWin;

    Moves(String moveName, String moveWin) {
        this.moveName = moveName;
        this.moveWin = moveWin;
    }

    public String getMoveName() {
        return moveName;
    }

    public String getMoveWin() {
        return moveWin;
    }
}
