package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstQ extends AppCompatActivity {
    int point = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_q);
        final Toast toast = Toast.makeText(getApplicationContext(), "Вот что получилось", Toast.LENGTH_LONG);
        final TextView wrong1 = findViewById(R.id.wrong1);
        final TextView wrong2 = findViewById(R.id.wrong2);
        final TextView truth = findViewById(R.id.truth);
        final Button next = findViewById(R.id.to2q);
        final TextView q = findViewById(R.id.question);
        wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q.setText("красный");
                toast.show();
                next.setVisibility(View.VISIBLE);
                wrong1.setBackgroundColor(Color.RED);
                wrong2.setBackgroundColor(Color.RED);
                truth.setBackgroundColor(Color.GREEN);
            }
        });
        wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q.setBackgroundColor(Color.RED);
                toast.show();
                next.setVisibility(View.VISIBLE);
                wrong1.setBackgroundColor(Color.RED);
                wrong2.setBackgroundColor(Color.RED);
                truth.setBackgroundColor(Color.GREEN);
            }
        });
        truth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q.setTextColor(Color.RED);
                wrong1.setBackgroundColor(Color.RED);
                wrong2.setBackgroundColor(Color.RED);
                point+=1;
                truth.setBackgroundColor(Color.GREEN);
                toast.show();
                next.setVisibility(View.VISIBLE);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(FirstQ.this, secondQ.class);
                next.putExtra("point", point);
                startActivity(next);
            }
        });

    }
}
