package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);

    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    // Increase score for team A & B by 1
    public void scoreForTeamA(View view) {
        scoreTeamA += 1;
        displayScoreForTeamA(scoreTeamA);
    }
    public void scoreForTeamB(View view) {
        scoreTeamB += 1;
        displayScoreForTeamB(scoreTeamB);
    }

    // Increase foul for team A & B by 1
    public void foulForTeamA(View view) {
        foulTeamA += 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void foulForTeamB(View view) {
        foulTeamB += 1;
        displayFoulForTeamB(foulTeamB);
    }

    // Increase yellow card for team A & B by 1
    public void yellowCardForTeamA(View view) {
        yellowCardTeamA += 1;
        displayYellowCardForTeamA(yellowCardTeamA);
    }

    public void yellowCardForTeamB(View view) {
        yellowCardTeamB += 1;
        displayYellowCardForTeamB(yellowCardTeamB);
    }

    // Increase red card for team A & B by 1
    public void redCardForTeamA(View view) {
        redCardTeamA += 1;
        displayRedCardForTeamA(redCardTeamA);
    }

    public void redCardForTeamB(View view) {
        redCardTeamB += 1;
        displayRedCardForTeamB(redCardTeamB);
    }

    // Display the score for team A
    public void displayScoreForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    // Display the score for team B
    public void displayScoreForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    // Display the foul for team A
    public void displayFoulForTeamA(int foulTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foulTeamA));
    }

    // Display the foul for team B
    public void displayFoulForTeamB(int foulTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foulTeamB));
    }

    // Display the yellow card for team A
    public void displayYellowCardForTeamA(int yellowCardTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(yellowCardTeamA));
    }

    // Display the yellow card for team B
    public void displayYellowCardForTeamB(int yellowCardTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(yellowCardTeamB));
    }

    // Display the red card for team A
    public void displayRedCardForTeamA(int redCardTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(redCardTeamA));
    }

    // Display the red card for team B
    public void displayRedCardForTeamB(int redCardTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(redCardTeamB));
    }

    // Reset all scores to 0
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);

    }
}