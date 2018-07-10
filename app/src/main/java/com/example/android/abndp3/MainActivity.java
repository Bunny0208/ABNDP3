package com.example.android.abndp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    RadioGroup ques1;
    RadioGroup ques3;
    RadioGroup ques4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ques1 = findViewById(R.id.ques1_radio);
        ques3 = findViewById(R.id.ques3_radio);
        ques4 = findViewById(R.id.ques4_radio);

    }

    public void ButtonClick(View view) {
        score = 0;
        RadioGroup checkAnswer1 = findViewById(R.id.ques1_radio);
        if(checkAnswer1.getCheckedRadioButtonId() != -1) {
            String ans1 = ((RadioButton) findViewById(ques1.getCheckedRadioButtonId())).getText().toString();
            if (ans1.equalsIgnoreCase("Italy")) {
                score++;
            }
        }

        if(((EditText)findViewById(R.id.card2_et)).getText().toString().equalsIgnoreCase("Uruguay"))
        {
            score++;
        }

        RadioGroup checkAnswer3 = findViewById(R.id.ques3_radio);
        if(checkAnswer3.getCheckedRadioButtonId() != -1) {
            String ans3 = ((RadioButton) findViewById(ques3.getCheckedRadioButtonId())).getText().toString();
            if (ans3.equalsIgnoreCase("Mario Zagallo")) {
                score++;
            }
        }

        RadioGroup checkAnswer4 = findViewById(R.id.ques4_radio);
        if(checkAnswer4.getCheckedRadioButtonId() != -1) {
            String ans4 = ((RadioButton) findViewById(ques4.getCheckedRadioButtonId())).getText().toString();
            if (ans4.equalsIgnoreCase("Miroslav Klose")) {
                score++;
            }
        }
        CheckBox q5ch1 = findViewById(R.id.card5_ch1);
        CheckBox q5ch2 = findViewById(R.id.card5_ch2);
        CheckBox q5ch3 = findViewById(R.id.card5_ch3);
        CheckBox q5ch4 = findViewById(R.id.card5_ch4);

        if(q5ch1.isChecked() && q5ch2.isChecked() && !q5ch3.isChecked() && !q5ch4.isChecked() )
        {
            score++;
        }
        if(score==5)
        {
            Toast.makeText(this, "Congratulations!!! You Scored " + score + " out of 5", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "You Scored " + score + " out of 5", Toast.LENGTH_SHORT).show();
        }
    }
}
