package com.example.yuto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Double answer = intent.getDoubleExtra("VALUE1", 0.0);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(answer));
    }
}
