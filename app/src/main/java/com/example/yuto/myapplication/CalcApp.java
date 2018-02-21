package com.example.yuto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class CalcApp extends AppCompatActivity  implements View.OnClickListener{

    EditText EditText1, EditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_app);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        EditText1 = (EditText) findViewById(R.id.editText1);
        EditText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Double v1, v2, answer = 0.0;
        try {v1 = Double.valueOf(EditText1.getText().toString());}
        catch(java.lang.NumberFormatException e){v1 = 0.0;}
        try {v2 = Double.valueOf(EditText2.getText().toString());}
        catch(java.lang.NumberFormatException e){v2 = 0.0;}

        
        if (view.getId() == R.id.button1) answer = v1 + v2;
        else if (view.getId() == R.id.button2) answer = v1 - v2;
        else if (view.getId() == R.id.button3) answer = v1 * v2;
        else if (view.getId() == R.id.button4) answer = v1 / v2;

        intent.putExtra("VALUE1", answer);
        startActivity(intent);
    }
}
