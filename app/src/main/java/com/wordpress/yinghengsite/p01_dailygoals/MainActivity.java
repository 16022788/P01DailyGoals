package com.wordpress.yinghengsite.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    int srb1;
    int srb2;
    int srb3;
    String summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //First grp
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
                int selectedButtonId = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId);
                srb1 = selectedButtonId;

                //2nd grp
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
                int selectedButtonId2 = rg1.getCheckedRadioButtonId();
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);
                srb2 = selectedButtonId;

                //3rd grp
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
                int selectedButtonId3 = rg1.getCheckedRadioButtonId();
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);
                srb3 = selectedButtonId;

                //Reflection by user
                EditText Reflect = (EditText) findViewById(R.id.editTextReflect);

                summary = Reflect.getText().toString();

                String[] info = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), Reflect.getText().toString()};
                Intent i = new Intent(MainActivity.this, Summary.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
    }
}
