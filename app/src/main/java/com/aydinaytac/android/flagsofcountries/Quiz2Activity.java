package com.aydinaytac.android.flagsofcountries;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by @aydinaytac on 6.02.2018.
 */

public class Quiz2Activity extends AppCompatActivity {

    int q5Checked = 0;
    int q6Checked = 0;
    int q7Checked = 0;
    int q8Checked = 0;

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

    /**
     * This method is called when question 5 check button is pressed.
     *
     * @param v
     */
    public void q5CheckButton(View v) {

        //check button declaration
        Button q5CheckButton = findViewById(R.id.question5_check_button);
        q5CheckButton.setEnabled(false);

        //This method gets the answer of question 5 EditText field.
        EditText answerQ5EditText = findViewById(R.id.question5_edittext);
        String answerQuestion5 = answerQ5EditText.getText().toString();
        //Player have to enter a name to go on.
        if (answerQuestion5.equals("")) {
            q5CheckButton.setEnabled(true);
            Toast.makeText(this, R.string.question5_warning, Toast.LENGTH_SHORT).show();
        } else if (answerQuestion5.equals(getString(R.string.question5_answer))) {
            q5Checked = 1;
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            q5Checked = 1;
            // Answer is wrong
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when question 6 check button is pressed.
     *
     * @param v
     */
    public void q6CheckButton(View v) {

        //check button declaration
        Button q6CheckButton = findViewById(R.id.question6_check_button);
        q6CheckButton.setEnabled(false);

        //This method gets the answer of question 6 EditText field.
        EditText answerQ6EditText = findViewById(R.id.question6_edittext);
        String answerQuestion6 = answerQ6EditText.getText().toString();
        //Player have to enter a name to go on.
        if (answerQuestion6.equals("")) {
            q6CheckButton.setEnabled(true);
            Toast.makeText(this, R.string.question6_warning, Toast.LENGTH_SHORT).show();
        } else if (answerQuestion6.equals(getString(R.string.question6_answer))) {
            q6Checked = 1;
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            q6Checked = 1;
            // Answer is wrong
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when question 7 check button is pressed.
     *
     * @param v
     */
    public void q7CheckButton(View v) {

        //check button declaration
        Button q7CheckButton = findViewById(R.id.question7_check_button);
        q7CheckButton.setEnabled(false);

        //This method gets the answer of question 5 EditText field.
        EditText answerQ7EditText = findViewById(R.id.question7_edittext);
        String answerQuestion7 = answerQ7EditText.getText().toString();
        //Player have to enter a name to go on.
        if (answerQuestion7.equals("")) {
            q7CheckButton.setEnabled(true);
            Toast.makeText(this, R.string.question7_warning, Toast.LENGTH_SHORT).show();
        } else if (answerQuestion7.equals(getString(R.string.question7_answer))) {
            q7Checked = 1;
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            q7Checked = 1;
            // Answer is wrong
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when question 8 check button is pressed.
     *
     * @param v
     */
    public void q8CheckButton(View v) {

        //check button declaration
        Button q8CheckButton = findViewById(R.id.question8_check_button);
        q8CheckButton.setEnabled(false);

        //This method gets the answer of question 8 EditText field.
        EditText answerQ8EditText = findViewById(R.id.question8_edittext);
        String answerQuestion8 = answerQ8EditText.getText().toString();
        //Player have to enter a name to go on.
        if (answerQuestion8.equals("")) {
            q8CheckButton.setEnabled(true);
            Toast.makeText(this, R.string.question8_warning, Toast.LENGTH_SHORT).show();
        } else if (answerQuestion8.equals(getString(R.string.question8_answer))) {
            q8Checked = 1;
            answerQ8EditText.setEnabled(false);
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            q8Checked = 1;
            answerQ8EditText.setEnabled(false);
            // Answer is wrong
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when submit button is pressed.
     *
     * @param v
     */
    public void submitButton(View v) {

        int checkedAll = q5Checked + q6Checked + q7Checked + q8Checked;

        if (checkedAll == 4) {
            //Layout changed to solution after completion
            setContentView(R.layout.solution);

            //EnfOfQuiz message includes the name of the user and the amount of correct answers
            TextView endOfMessage = findViewById(R.id.solution_endof_message);
            String endOfMessageText = getString(R.string.congratulations, MainActivity.getPlayerName(), endOfQuizSummaryMessage(), MainActivity.getScore());
            endOfMessage.setText(endOfMessageText);

        } else if (checkedAll < 4) {
            Toast.makeText(this, getString(R.string.not_checked_question), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method calculates how much questions do the user answered correctly.
     *
     * @return numberOfCorrectAnswers
     */
    public int endOfQuizSummaryMessage() {
        int numberOfCorrectAnswers = MainActivity.getScore() / 10;
        return numberOfCorrectAnswers;
    }
}
