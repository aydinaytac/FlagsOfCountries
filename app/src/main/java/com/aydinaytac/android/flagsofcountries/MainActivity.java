package com.aydinaytac.android.flagsofcountries;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String playerName;
    private static int score;
    private static MediaPlayer mediaPlayer;

    public static String getPlayerName() {
        return playerName;
    }

    public static int getScore() {
        return score;
    }

    public static void increaseScore() {
        score += 10;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.national_anthem);
        mediaPlayer.start();
    }

    public void startQuizButton(View v) {
        //This method gets the name of the user from EditText field.
        EditText nameEditText = (EditText) findViewById(R.id.name_edittext);
        playerName = nameEditText.getText().toString();
        //Player have to enter a name to go on.
        if (playerName.equals("")) {
            Toast.makeText(this, R.string.enter_name_warning, Toast.LENGTH_SHORT).show();
        } else {
            // And now quiz activity starts ;)
            Intent quizIntent = new Intent(this, QuizActivity.class);
            startActivity(quizIntent);
        }
    }
}
