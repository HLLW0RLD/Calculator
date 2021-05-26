package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lesson1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1);

        Button tap = findViewById(R.id.tapbutton);
        final TextView view = findViewById(R.id.view);

        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText("tap!");
            }
        });

    }
}