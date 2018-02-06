package com.aydinaytac.android.flagsofcountries;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by 186357 on 6.02.2018.
 */

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity);

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
    }

    public void radioButtonOnClick1 (View v){
        RadioButton q1OptA;
        RadioButton q1OptB;
        RadioButton q1OptC;
        RadioButton q1OptD;

        q1OptA = (RadioButton) findViewById(R.id.q1OptA);
        q1OptB = (RadioButton) findViewById(R.id.q1OptB);
        q1OptC = (RadioButton) findViewById(R.id.q1OptC);
        q1OptD = (RadioButton) findViewById(R.id.q1OptD);

                if (q1OptC.isChecked()) {
                    MainActivity.increaseScore();
                    Toast.makeText(this, getString(R.string.correct) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, getString(R.string.incorrect) + " " + MainActivity.getScore(), Toast.LENGTH_SHORT).show();
                }
                q1OptA.setClickable(false);
                q1OptB.setClickable(false);
                q1OptC.setClickable(false);
                q1OptD.setClickable(false);
    }

    public void radioButtonOnClick2 (View v){
        RadioButton q2OptA;
        RadioButton q2OptB;
        RadioButton q2OptC;
        RadioButton q2OptD;

        q2OptA = (RadioButton) findViewById(R.id.q2OptA);
        q2OptB = (RadioButton) findViewById(R.id.q2OptB);
        q2OptC = (RadioButton) findViewById(R.id.q2OptC);
        q2OptD = (RadioButton) findViewById(R.id.q2OptD);

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

    public void radioButtonOnClick3 (View v){
        RadioButton q3OptA;
        RadioButton q3OptB;
        RadioButton q3OptC;
        RadioButton q3OptD;

        q3OptA = (RadioButton) findViewById(R.id.q3OptA);
        q3OptB = (RadioButton) findViewById(R.id.q3OptB);
        q3OptC = (RadioButton) findViewById(R.id.q3OptC);
        q3OptD = (RadioButton) findViewById(R.id.q3OptD);

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

    public void radioButtonOnClick4 (View v){
        RadioButton q4OptA;
        RadioButton q4OptB;
        RadioButton q4OptC;
        RadioButton q4OptD;

        q4OptA = (RadioButton) findViewById(R.id.q4OptA);
        q4OptB = (RadioButton) findViewById(R.id.q4OptB);
        q4OptC = (RadioButton) findViewById(R.id.q4OptC);
        q4OptD = (RadioButton) findViewById(R.id.q4OptD);

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

    public void nextQuestionButton (View v){
        Intent quiz2Intent = new Intent(this, Quiz2Activity.class);
        startActivity(quiz2Intent);
        }
}
