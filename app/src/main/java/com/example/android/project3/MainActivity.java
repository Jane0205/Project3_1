package com.example.android.project3;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    int score = 0;
    final int A2 = R.id.SKorea;
    final int A4 = R.id.boy;
    final String A5 = "Jaeeun Lee";

    CheckBox month1 = (CheckBox) findViewById(R.id.month1);
    CheckBox month2 = (CheckBox) findViewById(R.id.month2);
    CheckBox month3 = (CheckBox) findViewById(R.id.month3);
    CheckBox day1 = (CheckBox) findViewById(R.id.day1);
    CheckBox day2 = (CheckBox) findViewById(R.id.day2);
    CheckBox day3 = (CheckBox) findViewById(R.id.day3);
    CheckBox major1 = (CheckBox) findViewById(R.id.major1);
    CheckBox major2 = (CheckBox) findViewById(R.id.major2);
    CheckBox major3 = (CheckBox) findViewById(R.id.major3);
    CheckBox major4 = (CheckBox) findViewById(R.id.major4);
    RadioGroup Q2rg = (RadioGroup) findViewById(R.id.from);
    RadioGroup Q4rg = (RadioGroup) findViewById(R.id.sibling);
    EditText Q5et = (EditText) findViewById(R.id.name);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean Q1() {
        if (month1.isChecked() && !month2.isChecked() && !month3.isChecked()) {
            return true;
        }
        return false;
    }
    public boolean Q1_1() {
    if (day1.isChecked() && !day2.isChecked() && !day3.isChecked()) {
        return true;
        }
        return false;
    }
    public boolean Q2() {
        if (Q2rg.getCheckedRadioButtonId() == A2) {
        }
        return true;
    }

    public boolean Q3_1() {

        if (major1.isChecked()) {
            return true;
        }
        return false;
    }
    public boolean Q3_2() {

        if (major2.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q3_3() {

        if (major3.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q3_4() {

        if (major4.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean Q4() {

        if (Q4rg.getCheckedRadioButtonId() == A4) {
            return true;
        }
        return false;
    }

    public boolean Q5() {
        if (Q5et.getText().toString().equalsIgnoreCase(A5)) {
            return true;
        }
        return false;
    }

    public int calculateScore() {

        if(Q1()){
            score=score+10;
            if(Q1_1()){
                score=score+10;
            }
        }
        if(Q2()){
            score=score+20;
        }
        if(Q3_1()){
            score=score+5;
            if(Q3_2()){
                score=score+5;
                if(Q3_3()){
                    score=score+5;
                    if(Q3_4()){
                        score=score+5;
                    }
                }
            }
        }
        if(Q4()){
            score=score+20;
        }
        if(Q5()){
            score=score+20;
        }

        return score;
    }

    public void submit(){
        int totalScore =calculateScore();
        Toast.makeText(this, "Congratuation!\nYour score is" + totalScore, Toast.LENGTH_LONG).show();

    }
//    private String Summary(boolean Q1A1,) {
//        String Message = "Name: "+Q1A1;
//        return Message;
//    }

}


    /*
    public int Q1(View view) {
        if (month1.isChecked() == true) {
            score = +10;
            if (day1.isChecked() == true) {
                score = +10;
            }
        }
        return score;
    }

    public int Q2(View view) {

    //    RadioGroup RG2 = (RadioGroup) findViewById(R.id.from);

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.SKorea:
                if (checked)
                    score += 20;
                break;
            case R.id.America:
                if (checked)
                    break;
            case R.id.Brazil:
                if (checked)
                    break;
            case R.id.NKorea:
                if (checked)
                    break;
        }
        return score;
    }

    public int Q3(View view) {
//        if(major1.isChecked()) {
//            score += 5;
//            if (major2.isChecked()) {
//                score += 5;
//                if (major3.isChecked()){
//                    score += 5;
//                if (major4.isChecked())
//                    score += 5;
//                }
//            }
//        }
//        return score;
        // Is the view now checked?
        boolean checked3 = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.major1:
                if (checked3)
                    score += 5;
                else
                    break;
            case R.id.major2:
                if (checked3)
                    score += 5;
                else
                    break;
            case R.id.major3:
                if (checked3)
                    score += 5;
                else
                    // Remove the meat
                    break;
            case R.id.major4:
                if (checked3)
                    score += 5;
                else

                    break;
        }
        return score;
    }

    public void Q4(View view) {
        // Is the button now checked?
        boolean checked4 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.sis:
                if (checked4)
                    score += 20;
                break;
            case R.id.bro:
                if (checked4)
                    break;
            case R.id.only:
                if (checked4)
                    break;
        }

    }

    public int Q5(View view) {
        EditText a5 = (EditText) findViewById(R.id.name);
        if(a5.getText().toString().equalsIgnoreCase(A5))
         score += 20;
        return score;

    }

    public void submit(View view) {

        Toast.makeText(this, "Congratuation!\nYour score is" + score, Toast.LENGTH_LONG).show();
    }
//    private void displayMessage(String message) {
//        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
//        orderSummaryTextView.setText(message);
//   }
//        submit.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
////                String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화
////                if(month1.isChecked() == true) result += month1.getText().toString();
//
//                if (month01) {
//                    if (day01) {
//                        Toast.makeText(
//                                MainActivity.this,
//                                (CharSequence) ("Month = " + month1.isChecked()
//                                        + ", " + "day = " + day1.isChecked()),
//                                Toast.LENGTH_LONG).show();
//                    }
//                    if (day02) {
//                        Toast.makeText(
//                                MainActivity.this,
//                                (CharSequence) ("Month = " + month1.isChecked()
//                                        + ", " + "day = " + day2.isChecked()),
//                                Toast.LENGTH_LONG).show();
//                    }
//                    if (day03) {
//                        Toast.makeText(
//                                MainActivity.this,
//                                (CharSequence) ("Month = " + month1.isChecked()
//                                        + ", " + "day = " + day3.isChecked()),
//                                Toast.LENGTH_LONG).show();
//                    }
//                }
//                if (month02){ if (day01) {
//                    Toast.makeText(
//                            MainActivity.this,
//                            (CharSequence) ("Month = " + month2.isChecked()
//                                    + ", " + "day = " + day1.isChecked()),
//                            Toast.LENGTH_LONG).show();
//                }
//                if (day02) {
//                    Toast.makeText(
//                            MainActivity.this,
//                            (CharSequence) ("Month = " + month2.isChecked()
//                                    + ", " + "day = " + day2.isChecked()),
//                            Toast.LENGTH_LONG).show();
//                }
//                if (day03) {
//                    Toast.makeText(
//                            MainActivity.this,
//                            (CharSequence) ("Month = " + month3.isChecked()
//                                    + ", " + "day = " + day3.isChecked()),
//                            Toast.LENGTH_LONG).show();
//                }}
//
//                if (month03) {
//                    if (day01)
//
//                    {
//                        Toast.makeText(
//                                MainActivity.this,
//                                (CharSequence) ("Month = " + month3.isChecked()
//                                        + ", " + "day = " + day1.isChecked()),
//                                Toast.LENGTH_LONG).show();
//                    }
//
//                    if (day02)
//
//                    {
//                        Toast.makeText(
//                                MainActivity.this,
//                                (CharSequence) ("Month = " + month3.isChecked()
//                                        + ", " + "day = " + day2.isChecked()),
//                                Toast.LENGTH_LONG).show();
//                    }
//
//                    if (day03)
//
//                    {
//                        Toast.makeText(
//                                MainActivity.this,
//                                (CharSequence) ("Month = " + month3.isChecked()
//                                        + ", " + "day = " + day3.isChecked()),
//                                Toast.LENGTH_LONG).show();
//                    }
//
//                }
//
//            }
//
//
//        });


//    public void onClick(View v){
//        //getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
//
//        int major1 = major.getCheckedRadioButtonId();
//        RadioButton major01 = (RadioButton) findViewById(R.id.major1);
//        int major2 = major.getCheckedRadioButtonId();
//        RadioButton major02 = (RadioButton) findViewById(R.id.major2);
//        int major3 = major.getCheckedRadioButtonId();
//        RadioButton major03 = (RadioButton) findViewById(R.id.major3);
//        int major4 = major.getCheckedRadioButtonId();
//        RadioButton major04 = (RadioButton) findViewById(R.id.major4);
//
//    }

*/
