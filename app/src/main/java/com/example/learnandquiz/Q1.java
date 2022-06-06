package com.example.learnandquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Q1 extends AppCompatActivity implements View.OnClickListener {
    Button done;
    ImageView v;
    EditText input;
    int count = 0;
    int score = 0;
    String in;
    int current_image;
    int[] images = {
            R.drawable.apple,
            R.drawable.cat,
            R.drawable.balloon,
            R.drawable.duck,
            R.drawable.elephant

    };
    String[] ans = {
            "A", "C", "B", "D", "E"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        done = findViewById(R.id.donebtn);
        done.setOnClickListener(this);
        v = findViewById(R.id.img);
        input = findViewById(R.id.ans);

    }

    @Override
    public void onClick(View view) {
//        showQuizImages();
        switch (count) {
            case 0:
                in = input.getText().toString().toUpperCase();
                if (in.equals(ans[count])) {
                    score++;
                }
                count++;
                break;
            case 1:
                current_image = current_image % images.length;
                v.setImageResource(images[current_image]);
                current_image++;
                input.getText().clear();
                in = input.getText().toString().toUpperCase();
                if (in.equals(ans[count])) {
                    score++;
                }
                count++;
                break;
             }
                count++;
                break;
            case 3:
                current_image = current_image % images.length;
                v.setImageResource(images[current_image]);
                current_image++;
                input.getText().clear();
                in = input.getText().toString().toUpperCase();
                if (in.equals(ans[count])) {
                    score++;


                }
                count++;
                break;

                if (in.equals(ans[count])) {
                    score++;
                }
                count++;
                break;
            default:
                Intent intent;
                intent = new Intent(Q1.this, result.class);
                intent.putExtra("score", score);
                startActivity(intent);
                break;


        }
    }
}