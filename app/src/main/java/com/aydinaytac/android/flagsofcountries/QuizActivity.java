package com.aydinaytac.android.flagsofcountries;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by @aydinaytac on 6.02.2018.
 */

public class QuizActivity extends AppCompatActivity {

    // Defining radio groups to check whether a question left unanswered or not
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity);

        //Creating a welcome pop-up message
        AlertDialog.Builder popUp = new AlertDialog.Builder(this);
        popUp.setMessage(getString(R.string.welcome) + " " + MainActivity.getPlayerName() + "!" + " " + getString(R.string.welcome_text));
        popUp.setPositiveButton(R.string.cont, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        popUp.create();
        popUp.show();

        //Matching radio groups with layout radio group IDs
        radioGroup1 = findViewById(R.id.q1_radiogroup);
        radioGroup1.clearCheck();
        radioGroup2 = findViewById(R.id.q2_radiogroup);
        radioGroup2.clearCheck();
        radioGroup3 = findViewById(R.id.q3_radiogroup);
        radioGroup3.clearCheck();
        radioGroup4 = findViewById(R.id.q4_radiogroup);
        radioGroup4.clearCheck();
    }

    /**
     * This method is called when an option is selected from question 1
     *
     * @param v
     */
    public void radioButtonOnClick1(View v) {

        //defining radio buttons to determine which one is selected by the user.
        RadioButton q1OptA;
        RadioButton q1OptB;
        RadioButton q1OptC;
        RadioButton q1OptD;

        //matching the radio buttons from layout with Java objects.
        q1OptA = findViewById(R.id.q1OptA);
        q1OptB = findViewById(R.id.q1OptB);
        q1OptC = findViewById(R.id.q1OptC);
        q1OptD = findViewById(R.id.q1OptD);

        //option C is correct ;)
        if (q1OptC.isChecked()) {
            //Increasing score
            MainActivity.increaseScore();
            //Correct toast message appers
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            //Incorrect toast message appers
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
        //After selecting a radio button, you can't change it ;)
        q1OptA.setClickable(false);
        q1OptB.setClickable(false);
        q1OptC.setClickable(false);
        q1OptD.setClickable(false);
    }

    /**
     * This method is called when an option is selected from question 2
     *
     * @param v
     */
    public void radioButtonOnClick2(View v) {

        RadioButton q2OptA;
        RadioButton q2OptB;
        RadioButton q2OptC;
        RadioButton q2OptD;

        q2OptA = findViewById(R.id.q2OptA);
        q2OptB = findViewById(R.id.q2OptB);
        q2OptC = findViewById(R.id.q2OptC);
        q2OptD = findViewById(R.id.q2OptD);

        if (q2OptD.isChecked()) {
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
        q2OptA.setClickable(false);
        q2OptB.setClickable(false);
        q2OptC.setClickable(false);
        q2OptD.setClickable(false);
    }

    /**
     * This method is called when an option is selected from question 3
     *
     * @param v
     */
    public void radioButtonOnClick3(View v) {

        RadioButton q3OptA;
        RadioButton q3OptB;
        RadioButton q3OptC;
        RadioButton q3OptD;

        q3OptA = findViewById(R.id.q3OptA);
        q3OptB = findViewById(R.id.q3OptB);
        q3OptC = findViewById(R.id.q3OptC);
        q3OptD = findViewById(R.id.q3OptD);

        if (q3OptB.isChecked()) {
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
        q3OptA.setClickable(false);
        q3OptB.setClickable(false);
        q3OptC.setClickable(false);
        q3OptD.setClickable(false);
    }

    /**
     * This method is called when an option is selected from question 4
     *
     * @param v
     */
    public void radioButtonOnClick4(View v) {

        RadioButton q4OptA;
        RadioButton q4OptB;
        RadioButton q4OptC;
        RadioButton q4OptD;

        q4OptA = findViewById(R.id.q4OptA);
        q4OptB = findViewById(R.id.q4OptB);
        q4OptC = findViewById(R.id.q4OptC);
        q4OptD = findViewById(R.id.q4OptD);

        if (q4OptA.isChecked()) {
            MainActivity.increaseScore();
            Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
        }
        q4OptA.setClickable(false);
        q4OptB.setClickable(false);
        q4OptC.setClickable(false);
        q4OptD.setClickable(false);
    }

    /**
     * This method is called when next quiz button is pressed.
     *
     * @param v
     */
    public void nextQuestionButton(View v) {

        //Checking the questions if they are answered or not ;) and if it's ok, start next quiz
        if (radioGroup1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, R.string.question1_warning, Toast.LENGTH_SHORT).show();
        } else if (radioGroup2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, R.string.question2_warning, Toast.LENGTH_SHORT).show();
        } else if (radioGroup3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, R.string.question3_warning, Toast.LENGTH_SHORT).show();
        } else if (radioGroup4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, R.string.question4_warning, Toast.LENGTH_SHORT).show();
        } else {
            Intent quiz2Intent = new Intent(this, Quiz2Activity.class);
            startActivity(quiz2Intent);
        }
    }
}
