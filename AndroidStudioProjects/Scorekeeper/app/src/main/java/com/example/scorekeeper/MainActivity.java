package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScore1;
    private int mScore2;
    private TextView mScoreText1;
    private TextView mScoreText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find the TextViews by ID
        mScoreText1 = (TextView) findViewById(R.id.score_1);
        mScoreText2 = (TextView) findViewById(R.id.score_2);

    }

    public void decreaseScore(View view) {
    // Get de ID of the Button that was clicked
        int viewID = view.getId();
        switch (viewID){
         // if it was on team 1
            case R.id.decreaseTeam1:
                //Decrement the score and update the TextView
                mScore1--;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
          //if  it was Team 2
            case R.id.decreaseTeam2:
                // Drecrement the score and update de textview
                mScore2--;
                mScoreText2.setText(String.valueOf(mScore2));
        }

    }

    public void increaseScore(View view) {
        // get de id of the button that was clicked
        int viewID = view.getId();
        switch (viewID){
            //if it was on team 1
            case R.id.increaseTeam1:
                // Increment the score and update the textview
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            // if it was team 2
            case R.id.increaseTeam2:
                //increment the score and update the TextView
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
        }

    }
}