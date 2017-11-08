package com.example.fiona1.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.start;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;
    TextView playerMoveText;
    TextView computerMoveText;
    TextView winCountText;
    ImageView playerImage;
    ImageView computerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultText = (TextView) findViewById(R.id.txtResult);
        playerMoveText = (TextView) findViewById(R.id.txtPlayerMove);
        computerMoveText = (TextView) findViewById(R.id.txtComputerMove);
        winCountText = (TextView) findViewById(R.id.txtWinCount);

        playerImage = (ImageView) findViewById(R.id.imgPlayer);
        computerImage = (ImageView) findViewById(R.id.imgComp);



        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
        String playerMove = extras.getString("playerMove");
        String computerMove = extras.getString("computerMove");
        Integer winCountValue = extras.getInt("winCountInt");

        int image = getImage(playerMove);
        playerImage.setImageResource(image);
        image = getImage(computerMove);
        computerImage.setImageResource(image);


        resultText.setText(result);
        playerMoveText.setText(playerMove);
        computerMoveText.setText(computerMove);
        String win = winCountValue.toString();
        winCountText.setText("Number of wins " + win);

    }

    public int getImage(String move){
        switch (move) {
            case "Rock":
                return R.drawable.rock;
            case "Paper":
                return R.drawable.paper;
            case "Scissors":
                return R.drawable.scissor;
            case "Spock":
                return R.drawable.spock;
            default:
                return R.drawable.lizard;
        }
    }

    public void playAgain(View button){
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Integer winCountValue = extras.getInt("winCountInt");


        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("playerScore", winCountValue);

        startActivity(i);

    }
}
