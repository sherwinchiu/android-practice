package com.sherwin.basicfunctions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainGameActivity extends AppCompatActivity {
    private final char LENGTH = 3;
    private char pieces[][] = new char[LENGTH][LENGTH];
    private static int scores[] = new int[2];
    private static boolean inPlay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        Intent intent = getIntent(); // gets the intend sent to this activity
        String player1Name = intent.getStringExtra(MainActivity.PLAYER_1); // access property of MainActivity that has EXTRA_MESSAGE contained in it
        String player2Name = intent.getStringExtra(MainActivity.PLAYER_2);

        TextView player1TextView = (TextView) findViewById(R.id.player1TextView);
        TextView player2TextView = (TextView) findViewById(R.id.player2TextView);
        player1TextView.setText(player1Name);
        player2TextView.setText(player2Name);
        TextView score1TextView = (TextView) findViewById(R.id.score1TextView);
        TextView score2TextView = (TextView) findViewById(R.id.score2TextView);
        while(inPlay){
            score1TextView.setText(scores[0]);
            score2TextView.setText(scores[1]);

        }
    }
    private static void run(){

    }
}