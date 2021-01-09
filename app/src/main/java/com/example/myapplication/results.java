package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class results extends AppCompatActivity {
int point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        point = intent.getIntExtra("points", 0);
        TextView result = findViewById(R.id.textView);
        result.setText("Ваш результат " + point+ " из 5");
    }
}
