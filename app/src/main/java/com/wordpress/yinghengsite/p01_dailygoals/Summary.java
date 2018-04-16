package com.wordpress.yinghengsite.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView tv = (TextView)findViewById(R.id.textView10);

        Intent i = getIntent();

        String[] info = i.getStringArrayExtra("info");

        tv.setText("Read up on materials before class: " + info[0] + "\nArrive on time so as not to miss important part of the lesson: " + info[1] + "\nAttempt the problem myself: " + info[2] + "\nReflection: " + info[3]);

        Button btnClose = (Button) findViewById(R.id.buttonClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
