package com.example.fiona1.rockpaperscissors;

/**
 * Created by Fiona1 on 08/11/2017.
 */

public class Player {

    private String name;
    private String moveName;

    public Player(String name) {
        this.name = name;
        this.moveName = null;
    }

    public String getMoveName() {
        return moveName;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }
}
