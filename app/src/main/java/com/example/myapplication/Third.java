package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Third extends AppCompatActivity {
int point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        point = intent.getIntExtra("point", 0);
    }
    public void check(View v){
        EditText ans = findViewById(R.id.answer);
        int answer = Integer.parseInt(ans.getText().toString());
        Toast t = Toast.makeText(getApplicationContext(), "2147483647",Toast.LENGTH_LONG);
        t.show();
        if (answer==2147483647){
            point+=3;
        }
    }
    public void result(View v){
        Intent intent = new Intent(getApplicationContext(), results.class);
        intent.putExtra("points", point);
        startActivity(intent);
    }
}
