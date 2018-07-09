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
        String ans1 = ((RadioButton) findViewById(ques1.getCheckedRadioButtonId())).getText().toString();
        if(ans1.equalsIgnoreCase("Italy")) {
            score = score + 1;
        }

        if(((EditText)findViewById(R.id.card2_et)).getText().toString().equalsIgnoreCase("Uruguay"))
        {
            score = score + 1;
        }
       String ans3 = ((RadioButton) findViewById(ques3.getCheckedRadioButtonId())).getText().toString();
        if(ans3.equalsIgnoreCase("Mario Zagallo"))
        {
            score = score + 1;
        }
        String ans4 = ((RadioButton) findViewById(ques4.getCheckedRadioButtonId())).getText().toString();
        if(ans4.equalsIgnoreCase("Miroslav Klose"))
        {
            score = score +  1;
        }

        CheckBox q5ch1 = (CheckBox) findViewById(R.id.card5_ch1);
        boolean chk1 = q5ch1.isChecked();

        CheckBox q5ch2 = (CheckBox) findViewById(R.id.card5_ch2);
        boolean chk2 = q5ch2.isChecked();

        boolean right_ans = chk1 && chk2;
        if(right_ans)
        {
            score = score+ 1;
        }
        Toast.makeText(this, "You Scored " + score + " out of 5", Toast.LENGTH_SHORT).show();
    }
}
