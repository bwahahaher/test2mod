package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class secondQ extends AppCompatActivity {
    int point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_q);
        final CheckBox publicb=findViewById(R.id.publicb);
        final CheckBox secret=findViewById(R.id.secret);
        final CheckBox privateb=findViewById(R.id.privateb);
        final CheckBox protectedb=findViewById(R.id.protectedb);
        final CheckBox stat=findViewById(R.id.staticb);
        final Button next = findViewById(R.id.next);
        final Button check = findViewById(R.id.check);
        Intent intent = getIntent();
         point = intent.getIntExtra("point", 0);
        next.setVisibility(View.INVISIBLE);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                publicb.setBackgroundColor(Color.GREEN);
                secret.setBackgroundColor(Color.RED);
                privateb.setBackgroundColor(Color.GREEN);
                stat.setBackgroundColor(Color.RED);
                protectedb.setBackgroundColor(Color.GREEN);
                next.setVisibility(View.VISIBLE);
                check.setVisibility(View.INVISIBLE);
                if (publicb.isChecked()&&privateb.isChecked()&&protectedb.isChecked()){
                    point+=2;
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(secondQ.this, Third.class);
                next.putExtra("point", point);
                startActivity(next);
            }
        });
    }
}
