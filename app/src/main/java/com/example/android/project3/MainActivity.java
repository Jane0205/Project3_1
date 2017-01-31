package com.example.android.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;
    final int A2 = R.id.SKorea;
    final int A4 = R.id.bro;
    final String A5 = "Jaeeun Lee";

    String message = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean Q1() {
        CheckBox month1 = (CheckBox) findViewById(R.id.month1);
        CheckBox month2 = (CheckBox) findViewById(R.id.month2);
        CheckBox month3 = (CheckBox) findViewById(R.id.month3);
        if (month1.isChecked() && !month2.isChecked() && !month3.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q1_1() {
        CheckBox day1 = (CheckBox) findViewById(R.id.day1);
        CheckBox day2 = (CheckBox) findViewById(R.id.day2);
        CheckBox day3 = (CheckBox) findViewById(R.id.day3);
        if (day1.isChecked() && !day2.isChecked() && !day3.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q2() {
        RadioGroup Q2rg = (RadioGroup) findViewById(R.id.from);

        if (Q2rg.getCheckedRadioButtonId() == A2) {
        }
        return true;
    }

    public boolean Q3_1() {
        CheckBox major1 = (CheckBox) findViewById(R.id.major1);
        if (major1.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q3_2() {
        CheckBox major2 = (CheckBox) findViewById(R.id.major2);
        if (major2.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q3_3() {
        CheckBox major3 = (CheckBox) findViewById(R.id.major3);
        if (major3.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q3_4() {
        CheckBox major4 = (CheckBox) findViewById(R.id.major4);
        if (major4.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q4() {
        RadioGroup Q4rg = (RadioGroup) findViewById(R.id.sibling);
        if (Q4rg.getCheckedRadioButtonId() == A4) {
            return true;
        }
        return false;
    }

    public boolean Q5() {
        EditText Q5et = (EditText) findViewById(R.id.name);
        if (Q5et.getText().toString().equalsIgnoreCase(A5)) {
            return true;
        }
        return false;
    }

    public int calculateScore() {
        if (Q1()) {
            score = score + 10;
            if (Q1_1()) {
                score = score + 10;
            } else {
                message = "Q1 Answer is wrong";
            }
        }
        if (Q2()) {
            score = score + 20;
        } else {
            message += "\nQ2 Answer is wrong ";
        }
        if (Q3_1()) {
            score = score + 5;
            if (Q3_2()) {
                score = score + 5;
                if (Q3_3()) {
                    score = score + 5;
                    if (Q3_4()) {
                        score = score + 5;
                    }
                }
            }
        } else {
            message += "\nQ3 Answer is wrong ";
        }
        if (Q4()) {
            score = score + 20;
        } else {
            message += "\nQ4 Answer is wrong ";
        }
        if (Q5()) {
            score = score + 20;
        } else {
            message += "\nQ5 Answer is wrong ";
        }
        return score;
    }

    public void submit(View view) {
        int totalScore = calculateScore();
        Toast.makeText(this, "Congratulations!\nYour score is " + totalScore + "\n" + message, Toast.LENGTH_LONG).show();
        score = 0;
        message = "";
    }

}
