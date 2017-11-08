package com.example.fiona1.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Fiona1 on 08/11/2017.
 */

public class GameTest {

    private Game game;
    private ArrayList<Moves> moves;

    @Before
    public void setUp() throws Exception {

        moves = new ArrayList<>();

        for (Moves move : Moves.values()){
            moves.add(move);
        }

        game = new Game(moves);


    }

    @Test
    public void gameHasMoves() throws Exception {
        assertNotNull(game.getMoves());
    }

    @Test
    public void canReturnMoveAtIndex() throws Exception {
        Moves move = game.getMoveAtIndex(0);
        assertEquals("Rock", move.getMoveName());
        assertEquals("Scissors", move.getMoveWin());
    }

    @Test
    public void checkDraw() throws Exception {
        Moves playerMove = Moves.ROCK;
        Moves computerMove = Moves.ROCK;

        String result = game.checkWin(playerMove, computerMove);

        assertEquals("It's a draw!", result);
    }

    @Test
    public void checkPlayerWin() throws Exception {
        Moves playerMove = Moves.ROCK;
        Moves computerMove = Moves.SCISSORS;

        String result = game.checkWin(playerMove, computerMove);

        assertEquals("You Win!", result);

    }

    @Test
    public void checkComputerWin() throws Exception {
        Moves playerMove = Moves.ROCK;
        Moves computerMove = Moves.PAPER;

        String result = game.checkWin(playerMove, computerMove);

        assertEquals("Bad Luck...Computer Wins!", result);


    }
}
