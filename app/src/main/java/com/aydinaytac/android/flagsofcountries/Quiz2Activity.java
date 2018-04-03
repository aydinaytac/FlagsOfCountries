package com.aydinaytac.android.flagsofcountries;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by @aydinaytac on 6.02.2018.
 * Edited by @aydinaytac on 3.04.2018
 */

public class Quiz2Activity extends AppCompatActivity {

    int q5Checked;
    int q6Checked;
    int q7Checked;
    int q8Checked;
    int q9Checked;

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
            answerQ5EditText.setEnabled(false);
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            q5Checked = 1;
            answerQ5EditText.setEnabled(false);
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
            answerQ6EditText.setEnabled(false);
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            q6Checked = 1;
            answerQ6EditText.setEnabled(false);
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
            answerQ7EditText.setEnabled(false);
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            q7Checked = 1;
            answerQ7EditText.setEnabled(false);
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
     * This method controls the answers of Question 9 checkboxes
     *
     * @param v
     */
    public void q9checkbox(View v) {

        Button q9CheckButton = findViewById(R.id.question9_check_button);
        q9CheckButton.setEnabled(false);

        CheckBox checkbox1 = findViewById(R.id.checkbox1);
        CheckBox checkbox2 = findViewById(R.id.checkbox2);

        if (checkbox1.isChecked() && checkbox2.isChecked()) {
            q9Checked = 1;
            MainActivity.increaseScore();
            checkbox1.setEnabled(false);
            checkbox2.setEnabled(false);
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            q9Checked = 1;
            checkbox1.setEnabled(false);
            checkbox2.setEnabled(false);
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when finish button is pressed.
     *
     * @param v
     */
    public void finishButton(View v) {

        int checkedAll = q5Checked + q6Checked + q7Checked + q8Checked + q9Checked;

        if (checkedAll == 5) {
            // calculating the number of correct answers
            int numberOfCorrectAnswers = MainActivity.getScore() / 10;

            //EnfOfQuiz message includes the name of the user and the amount of correct answers
            String endOfMessageText = getString(R.string.congratulations, MainActivity.getPlayerName(), numberOfCorrectAnswers, MainActivity.getScore());
            Toast.makeText(this, endOfMessageText, Toast.LENGTH_LONG).show();

            //Enabling the solution button
            Button solutionButton = findViewById(R.id.solution_button);
            solutionButton.setEnabled(true);

        } else if (checkedAll < 5) {
            Toast.makeText(this, getString(R.string.not_checked_question), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when solution button is pressed.
     *
     * @param v
     */
    public void solutionButton(View v) {

        //Layout changed to solution after completion
        setContentView(R.layout.solution);

    }
}
