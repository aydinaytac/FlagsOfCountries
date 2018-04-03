package com.aydinaytac.android.flagsofcountries;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by @aydinaytac on 6.02.2018.
 */

public class MainActivity extends AppCompatActivity {

    //defining variables for player name and score
    private static String playerName;
    private static int score;
    private static MediaPlayer mediaPlayer;

    /**
     * This method  gives the player name entered to nameEditText when it's called.
     *
     * @return player name
     */
    public static String getPlayerName() {
        return playerName;
    }

    /**
     * This method gives the current score when it's called.
     *
     * @return score
     */
    public static int getScore() {
        return score;
    }

    /**
     * This method increases the score 10 points when it's called.
     */
    public static void increaseScore() {
        score += 10;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set mp to play the selected mp3 on app launch.
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.national_anthem);
        mediaPlayer.start();
    }

    public void startQuizButton(View v) {
        //gets the name of the user from EditText field.
        EditText nameEditText = findViewById(R.id.name_edittext);
        playerName = nameEditText.getText().toString();
        //Player have to enter a name to go on.
        if (playerName.equals("")) {
            Toast.makeText(this, R.string.enter_name_warning, Toast.LENGTH_SHORT).show();
        } else {
            // And now quiz activity starts ;)
            Intent quizIntent = new Intent(this, QuizActivity.class);
            startActivity(quizIntent);

            //Resetting the score 0 again, if the user didn't quit and clicks back button ;)
            score = 0;
        }
    }
}
