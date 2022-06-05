package com.example.learnandquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class learning_images extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_images);
        ImageView img = findViewById(R.id.show_img);
        Intent intent = getIntent();
        String str = intent.getStringExtra("btnID");
//        img.setText(str);
        switch (str) {
            case "A":
                img.setImageResource(R.drawable.a);
                break;
            case "B":
                img.setImageResource(R.drawable.b);
                break;
            case "C":
                img.setImageResource(R.drawable.c);
                break;
            case "D":
                img.setImageResource(R.drawable.d);
                break;
            case "E":
                img.setImageResource(R.drawable.e);
                break;
            case "F":
                img.setImageResource(R.drawable.f);
                break;
            case "G":
                img.setImageResource(R.drawable.g);
                break;
            case "H":
                img.setImageResource(R.drawable.h);
                break;
            case "I":
                img.setImageResource(R.drawable.i);
                break;
            case "J":
                img.setImageResource(R.drawable.j);
                break;
            case "K":
                img.setImageResource(R.drawable.k);
                break;
            case "L":
                img.setImageResource(R.drawable.l);
                break;
            case "M":
                img.setImageResource(R.drawable.m);
                break;
            case "N":
                img.setImageResource(R.drawable.n);
                break;
            case "O":
                img.setImageResource(R.drawable.o);
                break;
            case "P":
                img.setImageResource(R.drawable.p);
                break;
            case "Q":
                img.setImageResource(R.drawable.q);
                break;
            case "R":
                img.setImageResource(R.drawable.r);
                break;
            case "S":
                img.setImageResource(R.drawable.s);
                break;
            case "T":
                img.setImageResource(R.drawable.t);
                break;
            case "u":
                img.setImageResource(R.drawable.u);
                break;
            case "V":
                img.setImageResource(R.drawable.v);
                break;
            case "W":
                img.setImageResource(R.drawable.w);
                break;
            case "X":
                img.setImageResource(R.drawable.x);
                break;
            case "Y":
                img.setImageResource(R.drawable.y);
                break;
            case "Z":
                img.setImageResource(R.drawable.z);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + str);
        }

    }
}
