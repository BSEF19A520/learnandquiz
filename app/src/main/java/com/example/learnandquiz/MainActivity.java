package com.example.learnandquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button Learn, Quiz, list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Learn=findViewById(R.id.learnbtn);
        Learn.setOnClickListener(this);
        Quiz=findViewById(R.id.quizbtn);
        Quiz.setOnClickListener(this);
        list=findViewById(R.id.learnList);
        list.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.learnbtn:
                intent = new Intent(MainActivity.this, Learning.class);
                startActivity(intent);
                break;
            case R.id.learnList:
                intent = new Intent(MainActivity.this, learn_listView.class);
                startActivity(intent);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());

        }
    }
}