package com.aydinaytac.android.flagsofcountries;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 186357 on 6.02.2018.
 */

public class Quiz2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz2_activity);

        AlertDialog.Builder popUp = new AlertDialog.Builder(this);
        popUp.setMessage(getString(R.string.welcome) + " again " + MainActivity.getPlayerName() + "!" + " " + getString(R.string.welcome_text2) + " " + getString(R.string.current_score, MainActivity.getScore()));
        popUp.setPositiveButton(R.string.cont, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        popUp.create();
        popUp.show();
    }

    public void submitQuestion5Button (View v) {
        //This method gets the answer of question 5 EditText field.
        EditText answerQ5EditText = (EditText) findViewById(R.id.question5_edittext);
        String answerQuestion5 = answerQ5EditText.getText().toString();
        //Player have to enter a name to go on.
        if (answerQuestion5.equals(getString(R.string.question5_answer))) {
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            // Answer is wrong
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }

        Button question5Button = (Button) findViewById(R.id.question5_submit_button);
        question5Button.setEnabled(false);
    }

    public void submitQuestion6Button (View v) {
        //This method gets the answer of question 6 EditText field.
        EditText answerQ6EditText = (EditText) findViewById(R.id.question6_edittext);
        String answerQuestion6 = answerQ6EditText.getText().toString();
        //Player have to enter a name to go on.
        if (answerQuestion6.equals(getString(R.string.question6_answer))) {
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            // Answer is wrong
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }

        Button question6Button = (Button) findViewById(R.id.question6_submit_button);
        question6Button.setEnabled(false);
    }

    public void submitQuestion7Button (View v) {
        //This method gets the answer of question 7 EditText field.
        EditText answerQ7EditText = (EditText) findViewById(R.id.question7_edittext);
        String answerQuestion7 = answerQ7EditText.getText().toString();
        //Player have to enter a name to go on.
        if (answerQuestion7.equals(getString(R.string.question7_answer))) {
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            // Answer is wrong
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }

        Button question7Button = (Button) findViewById(R.id.question7_submit_button);
        question7Button.setEnabled(false);
    }

    public void submitQuestion8Button (View v) {
        //This method gets the answer of question 8 EditText field.
        EditText answerQ8EditText = (EditText) findViewById(R.id.question8_edittext);
        String answerQuestion8 = answerQ8EditText.getText().toString();
        //Player have to enter a name to go on.
        if (answerQuestion8.equals(getString(R.string.question8_answer))) {
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            // Answer is wrong
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }

        Button question8Button = (Button) findViewById(R.id.question8_submit_button);
        question8Button.setEnabled(false);

        //Layout changed to solution after completetion
        setContentView(R.layout.solution);

        //EnfOfQuiz message includes the name of the user and the amount of correct answers
        TextView endOfMessage = (TextView) findViewById(R.id.solution_endof_message);
        String endOfMessageText = getString(R.string.congratulations, MainActivity.getPlayerName(), endOfQuizSummaryMessage(), MainActivity.getScore());
        endOfMessage.setText(endOfMessageText);
    }

    //This method clculates how much questions do the user answered correctly.
    public int endOfQuizSummaryMessage () {
        int numberOfCorrectAnswers = MainActivity.getScore() / 10;
        return numberOfCorrectAnswers;
    }
}
