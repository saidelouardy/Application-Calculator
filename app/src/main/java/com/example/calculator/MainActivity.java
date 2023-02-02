package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttondelet;
    Button buttonmoine;
    Button buttonrigth;
    Button buttonleft;
    Button buttonpoint;
    Button buttonplus;
    Button buttonegale;
    Button button9isma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textcalcul);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button9isma = findViewById(R.id.button9isma);
        buttonmoine = findViewById(R.id.buttonmoine);
        buttonleft = findViewById(R.id.buttonleft);
        buttonrigth = findViewById(R.id.buttonrigth);
        buttondelet = findViewById(R.id.buttondelet);
        buttonpoint = findViewById(R.id.buttondelet);
        buttonplus = findViewById(R.id.buttonplus);
        buttonegale = findViewById(R.id.buttonegale);
        button1.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonrigth.setOnClickListener(this);
        buttonleft.setOnClickListener(this);
        buttonmoine.setOnClickListener(this);
        buttonpoint.setOnClickListener(this);
        buttondelet.setOnClickListener(this);
        buttonplus.setOnClickListener(this);
        button9isma.setOnClickListener(this);
        buttonegale.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


    }
}