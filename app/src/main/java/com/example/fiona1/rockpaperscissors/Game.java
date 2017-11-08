package com.example.fiona1.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Fiona1 on 08/11/2017.
 */




public class Game {

    private ArrayList<Moves> moves;
    private Integer winCount;

    public Game(ArrayList<Moves> moves, Integer winCount) {
        this.moves = moves;
        this.winCount = winCount;
    }

    public ArrayList<Moves> getMoves() {
        return moves;
    }

    public int getNumberofMoves(){
        return moves.size();
    }

    public Moves getMoveAtIndex(int index){
        Moves move = moves.get(index);
        return move;
    }

    public int getRandomNumber(){
        Random rand = new Random();
        int listSize = getNumberofMoves();
        int random = rand.nextInt(listSize);
        return random;
    }

    public Moves getComputerMove(){
        int index = getRandomNumber();
        Moves move = getMoveAtIndex(index);
        return move;
    }

    public String checkWin(Moves playerMove, Moves computerMove){
        if(playerMove.getMoveName() == computerMove.getMoveName()){
            return "It's a draw!";
        }else if(playerMove.getMoveName() == computerMove.getMoveWin()){
            return "Bad Luck...Computer Wins!";

        }else{
            incrementWin();
            return "You Win!";
        }
    }

    public void incrementWin(){
        this.winCount++;
    }

    public Integer getWinCount() {
        return winCount;
    }
}
