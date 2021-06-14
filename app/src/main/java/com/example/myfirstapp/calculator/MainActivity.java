package com.example.myfirstapp.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myfirstapp.R;

public class MainActivity extends AppCompatActivity {

    Counter count = new Counter();
    private TextView txt;
    private static final String ARG_RESULT = "ARG_RESULT";

    int num = count.getResult();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        Button key1 = findViewById(R.id.button1);
        Button key2 = findViewById(R.id.button2);
        Button key3 = findViewById(R.id.button3);
        Button key4 = findViewById(R.id.button4);
        Button key5 = findViewById(R.id.button5);
        Button key6 = findViewById(R.id.button6);
        Button key7 = findViewById(R.id.button7);
        Button key8 = findViewById(R.id.button8);
        Button key9 = findViewById(R.id.button9);
        Button key0 = findViewById(R.id.button0);
        Button minus = findViewById(R.id.buttonMINUS);
        Button plus = findViewById(R.id.buttonPlUS);
        Button split = findViewById(R.id.buttonSPlIT);
        Button mult = findViewById(R.id.buttonMULTIPL);
        Button equals = findViewById(R.id.buttonEQLS);

        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(1);
            }
        });

        key2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(2);
            }
        });

        key3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(3);
            }
        });

        key4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(4);
            }
        });

        key5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(5);
            }
        });

        key6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(6);
            }
        });

        key7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(7);
            }
        });

        key8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(8);
            }
        });

        key9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(9);
            }
        });

        key0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.number(0);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.operators(1);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.operators(2);
            }
        });

        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.operators(3);
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.operators(4);
            }
        });
    }

    public void showResult(int result){
        txt.setText(result);
    }
}
