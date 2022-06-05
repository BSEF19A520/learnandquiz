package com.example.learnandquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    learning_list alphs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSelectedAlphabet();
        setValues();
    }
    public void getSelectedAlphabet()
    {
        String prevIntenttostr=getIntent().getStringExtra("id");
        alphs=learn_listView.alphList.get(Integer.valueOf(prevIntenttostr));
    }
    public void setValues()
    {
        TextView tv=findViewById((R.id.detail_txt));
        ImageView iv=findViewById((R.id.detailimg));
        tv.setText(alphs.getAlphabet());
        iv.setImageResource(alphs.getImageid());
    }

}