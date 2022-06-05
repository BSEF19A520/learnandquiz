package com.example.learnandquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class learn_listView extends AppCompatActivity {
    ListView listView;
    AlphAdaptor adaptor;
    public static ArrayList<learning_list> alphList = new ArrayList<learning_list>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_list_view);
        setUpData();
        setUpList();

    }

    private void setUpData() {
        learning_list alphA = new learning_list(0, R.drawable.a, "A");
        learning_list alphB = new learning_list(1, R.drawable.b, "B");
        learning_list alphC = new learning_list(2, R.drawable.c, "C");
        learning_list alphD = new learning_list(3, R.drawable.d, "D");
        learning_list alphE = new learning_list(4, R.drawable.e, "E");
        learning_list alphF = new learning_list(5, R.drawable.f, "F");
        learning_list alphG = new learning_list(6, R.drawable.g, "G");
        learning_list alphH = new learning_list(7, R.drawable.h, "H");
        learning_list alphI = new learning_list(8, R.drawable.i, "I");
        learning_list alphJ = new learning_list(9, R.drawable.j, "J");
        learning_list alphK = new learning_list(10, R.drawable.k, "K");
        learning_list alphL = new learning_list(11, R.drawable.l, "L");
        learning_list alphM = new learning_list(12, R.drawable.m, "M");
        learning_list alphN = new learning_list(13, R.drawable.n, "N");
        learning_list alphO = new learning_list(14, R.drawable.o, "O");
        learning_list alphP = new learning_list(15, R.drawable.p, "P");
        learning_list alphQ = new learning_list(16, R.drawable.q, "Q");
        learning_list alphR = new learning_list(17, R.drawable.r, "R");
        learning_list alphS = new learning_list(18, R.drawable.s, "S");
        learning_list alphT = new learning_list(19, R.drawable.t, "T");
        learning_list alphU = new learning_list(20, R.drawable.u, "U");
        learning_list alphV = new learning_list(21, R.drawable.v, "V");
        learning_list alphW = new learning_list(22, R.drawable.w, "W");
        learning_list alphX = new learning_list(23, R.drawable.x, "X");
        learning_list alphY = new learning_list(24, R.drawable.y, "Y");
        learning_list alphZ = new learning_list(25, R.drawable.z, "Z");
        alphList.add(alphA);
        alphList.add(alphB);
        alphList.add(alphC);
        alphList.add(alphD);
        alphList.add(alphE);
        alphList.add(alphF);
        alphList.add(alphG);
        alphList.add(alphH);
        alphList.add(alphI);
        alphList.add(alphJ);
        alphList.add(alphK);
        alphList.add(alphL);
        alphList.add(alphM);
        alphList.add(alphN);
        alphList.add(alphO);
        alphList.add(alphP);
        alphList.add(alphQ);
        alphList.add(alphR);
        alphList.add(alphS);
        alphList.add(alphT);
        alphList.add(alphU);
        alphList.add(alphV);
        alphList.add(alphW);
        alphList.add(alphX);
        alphList.add(alphY);
        alphList.add(alphZ);

    }

    private void setUpList() {
        listView = findViewById(R.id.listOfAlphs);
        adaptor = new AlphAdaptor(getApplicationContext(), 0, alphList);
        listView.setAdapter(adaptor);
    }
}