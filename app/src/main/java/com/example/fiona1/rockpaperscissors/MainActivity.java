package com.example.fiona1.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;
    private Game game;
    private ArrayList<Moves> moves;
    private Integer playerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moves = new ArrayList<>();
        for (Moves move : Moves.values()) {
            moves.add(move);
        }



        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (intent.hasExtra("playerScore")){
            playerScore = extras.getInt("playerScore");
        }else{
            playerScore = 0;
        }


        game = new Game(moves, playerScore);

        rockButton = (Button) findViewById(R.id.btnRock);
        paperButton = (Button) findViewById(R.id.btnPaper);
        scissorsButton = (Button) findViewById(R.id.btnScissors);
    }

    public void moveClicked(View button){
        Moves playerMove = getButtonClicked(button);
        Moves computerMove = game.getComputerMove();

        String result = game.checkWin(playerMove, computerMove);
        String playerText = playerMove.getMoveName();
        String computerText = computerMove.getMoveName();
        Integer winCount = game.getWinCount();

        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("playerMove", playerText);
        intent.putExtra("computerMove", computerText);
        intent.putExtra("result", result);
        intent.putExtra("winCountInt", winCount);

        startActivity(intent);
    }

    public Moves getButtonClicked(View button){

        Moves playerMove;

        if(button == rockButton){
           playerMove = Moves.ROCK;

        }else if(button == paperButton){
            playerMove = Moves.PAPER;

        }else{
            playerMove = Moves.SCISSORS;
        }

        return playerMove;
    }




}
